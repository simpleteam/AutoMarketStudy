package com.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.MarketService;
import com.view.RegionView;
import com.view.UserView;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private MarketService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id")int id, Model model){
		
		UserView user = service.getUserById(id);
		model.addAttribute("user", user);
		return "/user/userDetails";
		
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String initCreationUser(Model model) {
		model.addAttribute("user", new UserView());
		return "/user/initCreateUser";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processCreatingUser(UserView user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("user", user);
			return "/user/initCreateUser";
		}
		service.addUser(user);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
	@ResponseBody
	public List<RegionView> getAllRegions(){
		return service.getAllRegions();
	}
	
	
	
	
	
	
	
}

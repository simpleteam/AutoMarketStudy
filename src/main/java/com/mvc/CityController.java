package com.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.CityDao;
import com.service.MarketService;
import com.view.CityView;



@Controller
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityDao cityDao;

	@Autowired
	private MarketService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showCity(@PathVariable("id") int id, Model model) {
		model.addAttribute("city", cityDao.get(id));
		return "/city/cityDetails";
	}
	
	
	@RequestMapping(value = "/getAllByRegion/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<CityView> getCitiesByRegion(@PathVariable("id")int id){
		
		System.out.println("========= "+id);
		
		return service.getCitiesByRegion(id);
	}
	

}

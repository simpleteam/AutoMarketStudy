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

import com.dao.RegionDao;
import com.service.MarketService;
import com.view.RegionView;



@Controller
@RequestMapping("/region")
public class RegionController {

	@Autowired
	private RegionDao regionDao;

	@Autowired
	private MarketService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showRegion(@PathVariable("id") int id, Model model) {
		model.addAttribute("region", service.getRegionById(id));
		return "/region/regionDetails";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String initCreationRegion(Model model) {
		model.addAttribute("region", new RegionView());
		return "/region/initCreateRegion";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processCreatingRegion(RegionView region, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("region", region);
			return "/region/initCreateRegion";
		}

		service.addRegion(region);
		region = service.getRegionByName(region.getRegion());

		model.addAttribute("region", region);

		// regionDao.add(region);
		return "redirect:/region/" + region.getId();
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ResponseBody
	public List<RegionView> getAllRegions() {
		return service.getAllRegions();
	}

}

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

import com.dao.AdvertisementDao;
import com.service.AdvertisementService;
import com.service.MarketService;
import com.view.AdvertisementView;



@Controller
@RequestMapping("/advertisement")
public class AdvertisementController {
	
	@Autowired
	private MarketService service;
	
	@Autowired
	private AdvertisementDao advertisementDao;
	
	@Autowired
	private AdvertisementService advertisementService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showAdvertisement(@PathVariable("id") int id, Model model) {
		model.addAttribute("region", service.getAdvertisementById(id));
		return "/region/advertisementDetails";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String initCreationAdvertisement(Model model) {
		model.addAttribute("region", new AdvertisementView());
		return "/advertisement/initCreateAdvertisement";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processCreatingAdvertisement(AdvertisementView advertisement, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("advertisement", advertisement);
			return "/advertisement/initCreateAdvertisement";
		}

		service.addAdvertisement(advertisement);;
		
	

		model.addAttribute("advertisement", advertisement);

		// regionDao.add(region);
		return "redirect:/region/" + advertisement.getId();
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ResponseBody
	public List<AdvertisementView> getAllAdvertisements(){
		return service.getAllAdvertisement();
	}
	
	@RequestMapping(value = "/getAllById/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<AdvertisementView> getAdvertisementsByModel(@PathVariable("id")int modelId){
		return advertisementService.getAllAdvertisementByModel(modelId);
	}
	
	@RequestMapping(value = "/getAll/{min}/{max}", method = RequestMethod.GET)
	@ResponseBody
	public List<AdvertisementView> getAdvertisementsByModel(@PathVariable("min")int min, @PathVariable("max")int max){
		return advertisementService.getAllByPrice(min, max);
	}
	
	@RequestMapping(value = "/getAll/{min}/{max}/{model}", method = RequestMethod.GET)
	@ResponseBody
	public List<AdvertisementView> getAdvertisementsByModel(@PathVariable("min")int min, @PathVariable("max")int max, @PathVariable("model")int model){
		return advertisementService.getAllByPrice(model, min, max);
	}
	
	

//	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
//	@ResponseBody
//	public List<RegionView> getAllRegions() {
//		return service.getAllRegions();
//	}
	
	
	
}

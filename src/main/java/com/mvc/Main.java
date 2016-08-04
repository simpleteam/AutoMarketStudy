package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.CityDao;
import com.dao.RegionDao;
import com.entity.City;
import com.entity.Region;
import com.service.MarketService;



@Controller
public class Main {

	@Autowired
	private MarketService ms;
	
	@Autowired
	private RegionDao regionDao;
	
	@Autowired
	private CityDao cityDao;
	
	@RequestMapping("/")
	public String main(Model model){
	
		return "index";
	}
	
	@RequestMapping(value="/j", method = RequestMethod.GET)
	@ResponseBody
	public List<Region> getJson(Model model){
		
		
		List<Region> regions = regionDao.getAll();
		List<String> list = new ArrayList<>(regions.size()) ;
		
		
		for(Region r : regions){
			list.add(r.getRegion());
		}
		return regions;
	}
	
	
	@RequestMapping(value="/g/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getTwo(@PathVariable("id")int id){
		
		
		System.out.println(id);
		
		
		
	
		List<City> cities = cityDao.getAll();
		
		List<String> list = new ArrayList<>();
		
		for(City c : cities){
			list.add(c.getCity());
		}
		
		
		
		
		return list;
		
		
		
	}

	
	
	
	
	
}

package com.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.view.SearchView;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring-context.xml")
@Transactional
public class UserMarketServiceTest {

	@Autowired
	private UserMarketService market;
	
	@Test
	public void testGetAdvertisements() {
	
		SearchView search = new SearchView();
		search.setCityId(2);
		assertEquals(4, market.getAdvertisements(search).size());	
		search.setModelId(1);
		System.out.println(market.getAdvertisements(search));
		
		assertEquals(1, market.getAdvertisements(search).size());
	}

}

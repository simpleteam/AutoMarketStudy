package com.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdvertisementDao;
import com.entity.Advertisement;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring-context.xml")
@Transactional
public class AdvertisementDaoTest {

	
	@Autowired
	private AdvertisementDao advertisementDao;
	
	
	@Test
	public void testAdd() {
		Advertisement advertisement = new Advertisement();
		advertisement.setDescription("description");
		advertisement.setPrice(34.5);
		advertisementDao.add(advertisement);
		assertEquals(advertisement.getId(), advertisementDao.get(advertisement.getId()).getId());
	}

	@Test
	public void testDelete() {
		Advertisement advertisement = new Advertisement();
		advertisement.setDescription("description");
		advertisement.setPrice(35.6);
		advertisementDao.add(advertisement);
		int id = advertisement.getId();
		advertisementDao.delete(advertisement);
		assertNull(advertisementDao.get(id));
	}

	@Test
	public void testGet() {
		
		for(Advertisement a : advertisementDao.getAll()){
			System.out.println(a.getPrice() + "-----------------------");
		}
		
		assertEquals(13800,advertisementDao.get(1).getPrice(),0);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByModel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByModelAndPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByModelAndYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByModelAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByModelAndUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllbyModelAndPriceAndYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllbyModelAndPriceAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllbyModelAndPriceAndYearAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByPriceAndYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByPriceAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByPriceAndUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllbyPriceAndYearAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByYearAndCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByCity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllByUser() {
		fail("Not yet implemented");
	}

}

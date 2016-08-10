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
		assertEquals(13800,advertisementDao.get(1).getPrice(),0);
	}

	@Test
	public void testUpdate() {
		Advertisement advertisement = advertisementDao.get(2);
		assertEquals(17800, advertisement.getPrice(),0);
		advertisement.setPrice(18200);
		advertisementDao.update(advertisement);
		assertEquals(18200, advertisementDao.get(2).getPrice(),0);
	}

	@Test
	public void testGetAll() {
		assertEquals(6, advertisementDao.getAll().size());
	}

	@Test
	public void testGetAllByModel() {
		assertEquals(2,advertisementDao.getAllByModel(1).size());
	}

	@Test
	public void testGetAllByPrice() {
		assertEquals(6, advertisementDao.getAllByPrice(13800, 67800).size());
		assertEquals(6, advertisementDao.getAllByPrice(13000, 68000).size());
		assertEquals(5, advertisementDao.getAllByPrice(13800, 67799.9).size());
		assertEquals(5, advertisementDao.getAllByPrice(13801, 67800).size());
		assertEquals(3, advertisementDao.getAllByPrice(17000, 39000).size());
	}

	@Test
	public void testGetAllByModelAndPrice() {
		assertEquals(2, advertisementDao.getAllByModelAndPrice(1, 13000, 28000).size());
	}

	@Test
	public void testGetAllByModelAndYear() {
		assertEquals(2,advertisementDao.getAllByModelAndYear(1, 2004, 2006));
	}

	@Test
	public void testGetAllByModelAndCity() {
		
		
		assertEquals(0,advertisementDao.getAllByModelAndCity(3, 1).size());
		assertEquals(1,advertisementDao.getAllByModelAndCity(3, 2).size());
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

package com.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TypeDao;
import com.entity.Type;




@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring-context.xml")
@Transactional
public class TypeDaoTest {

	@Autowired
	private TypeDao typeDao;
	
	@Test
	public void testCreateType(){
		Type type = new Type();
		type.setType("velo");
		typeDao.add(type);
		assertEquals(type, typeDao.get(type.getId()));
	}
	
	@Test
	public void testGetTypeById(){
		Type type = new Type();
		type.setId(1);
		type.setType("moto");
		typeDao.add(type);
		Type t = typeDao.get(type.getId());
		assertNotNull(t);	
	}
	
	@Test
	public void testUpdateType(){
		Type type = new Type();
		type.setType("planes");
		typeDao.add(type);
		type.setType("ships");
		assertEquals("ships", typeDao.get(type.getId()).getType());
	}
	
	@Test
	public void testDeleteType(){
		Type type = new Type();
		type.setType("auto");
		typeDao.add(type);
		typeDao.delete(type);
		assertNull(typeDao.get(type.getId()));	
	}
	
	
	
}

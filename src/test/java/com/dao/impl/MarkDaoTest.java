package com.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MarkDao;
import com.dao.TypeDao;
import com.entity.Mark;
import com.entity.Type;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring-context.xml")
@Transactional
public class MarkDaoTest {

	@Autowired
	private MarkDao markDao;
	
	@Autowired
	private TypeDao typeDao;
	
	@Test
	public void testAdd() {
		Type type = typeDao.get(1);
		Mark mark = new Mark();
		mark.setMark("Citroen");
		mark.setType(type);
		markDao.add(mark);
		assertEquals("Citroen", markDao.get(mark.getId()).getMark());
		assertEquals("auto",markDao.get(mark.getId()).getType().getType());
	}

	@Test
	public void testDelete(){
		Mark mark = markDao.get(1);
		markDao.delete(mark);
		assertNull(markDao.get(1));
	}

	@Test
	public void testGet() {
		assertEquals("bmw", markDao.get(2).getMark());
	}

	@Test
	public void testUpdate() {
		Mark mark = markDao.get(2);
		mark.setMark("Oldsmobile");
		markDao.update(mark);
		assertEquals("Oldsmobile", markDao.get(2).getMark());
	}

	@Test
	public void testGetAll() {
		assertEquals(7,markDao.getAll().size());
	}

}

package com.itheima.ssh01.dao.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.ssh01.dao.UserDAO;
import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDAOImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午4:05:47 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDAOImplTest {
	
	@Autowired
	private UserDAO userDAO;

	@Test
	public void testFindUserById() {
		User user = userDAO.findUserById(1);
		assertEquals("zhangsan", user.getUsername());
	}

}
  

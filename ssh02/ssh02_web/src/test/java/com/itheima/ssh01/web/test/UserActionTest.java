package com.itheima.ssh01.web.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.ssh01.service.UserService;

/**  
 * ClassName:UserActionTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午5:05:24 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
public class UserActionTest {

	@Autowired
	private UserService userService;
	@Test
	public void testFindUserById() {
		System.out.println(userService.findUserById(1));
	}

}
  

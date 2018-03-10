package com.itheima.ssh01.service.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.ssh01.domain.User;
import com.itheima.ssh01.service.UserService;

/**  
 * ClassName:UserServiceImplTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午4:33:15 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void test() {
		User user = userService.findUserById(1);
		assertEquals("zhangsan", user.getUsername());
	}

}
  

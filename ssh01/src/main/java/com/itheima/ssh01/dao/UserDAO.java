package com.itheima.ssh01.dao;

import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDAO <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 上午9:04:21 <br/>       
 */
public interface UserDAO {

    User findUserById(Integer id);

}
  

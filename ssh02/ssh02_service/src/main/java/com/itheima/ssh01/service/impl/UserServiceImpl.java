package com.itheima.ssh01.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.ssh01.dao.UserDAO;
import com.itheima.ssh01.domain.User;
import com.itheima.ssh01.service.UserService;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: <br/>
 * Date: 2018年3月9日 上午9:05:28 <br/>
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findUserById(Integer id) {

        return userDAO.findUserById(id);
    }

}

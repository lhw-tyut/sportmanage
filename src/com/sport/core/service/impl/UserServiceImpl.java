package com.sport.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sport.core.dao.UserDao;
import com.sport.core.po.User;
import com.sport.core.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired 
	private UserDao userDao;
    @Override
    public User findUser(String usercode,String password) {
    	User user=this.userDao.findUser(usercode, password);
		return user;
    }
}

package com.sport.core.service;

import com.sport.core.po.User;

public interface UserService {
      public User findUser(String usercode,String password);
}

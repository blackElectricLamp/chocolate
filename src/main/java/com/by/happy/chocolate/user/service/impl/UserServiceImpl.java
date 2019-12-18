package com.by.happy.chocolate.user.service.impl;

import com.by.happy.chocolate.user.dao.IUserDao;
import com.by.happy.chocolate.user.pojo.User;
import com.by.happy.chocolate.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create user:by
 * date:2019/10/21 14:19
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;



    @Override
    public void registerUser(User user) {
        userDao.registerUser(user);
    }
}

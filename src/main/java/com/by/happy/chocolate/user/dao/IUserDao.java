package com.by.happy.chocolate.user.dao;

import com.by.happy.chocolate.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Create user:by
 * date:2019/10/21 14:19
 */
@Mapper
public interface IUserDao {
    void registerUser(User user);
}

package com.by.happy.chocolate.user.controller;

import com.by.happy.chocolate.comm.pojo.BaseResponse;
import com.by.happy.chocolate.user.pojo.User;
import com.by.happy.chocolate.user.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Create user:by
 * date:2019/10/21 14:18
 */
@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);
    private IUserService userService;
    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }



    @RequestMapping("toRegisterUser")
    public String addUserPage(){
        return "user/registerUser";
    }

    @RequestMapping("registerUser")
    @ResponseBody
    public BaseResponse addUser(User user){
        BaseResponse br = new BaseResponse(BaseResponse.SUCCESS_CODE, "添加失败");
        System.out.println(user.getBirthday());
        try {
            userService.registerUser(user);
            br = new BaseResponse(BaseResponse.SUCCESS_CODE, "添加用户成功！");
        }catch (Exception e){
            logger.error("注册用户失败！" + e.getMessage());
            e.printStackTrace();
        }

        return br;
    }
}

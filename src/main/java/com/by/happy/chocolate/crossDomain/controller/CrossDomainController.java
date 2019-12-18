package com.by.happy.chocolate.crossDomain.controller;

import com.alibaba.fastjson.JSON;
import com.by.happy.chocolate.comm.pojo.BaseResponse;
import com.by.happy.chocolate.crossDomain.pojo.UploadResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Create user:by
 * date:2019/10/28 11:01
 */
@Controller
@RequestMapping("crossDomain")
public class CrossDomainController {

    @Value("${uploadFile.path}")
    private String filePath;

    @RequestMapping("uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam("upfile") MultipartFile upfile){
        UploadResponse uploadResponse = new UploadResponse();
        String fileName = upfile.getOriginalFilename();
        File file = new File(filePath + fileName);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            upfile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        uploadResponse.setOriginal("ssss");
        uploadResponse.setTitle("bytitle");
        uploadResponse.setState("SUCCESS");
        uploadResponse.setUrl("/images/" + fileName);
        return JSON.toJSONString(uploadResponse);
    }

    @RequestMapping("getUser")
    @ResponseBody
    public BaseResponse getUser(@RequestParam Map<String, Object> param){
        System.out.println(param.toString());
        return new BaseResponse(BaseResponse.SUCCESS_CODE, "获得用户信息成功！");
    }
}

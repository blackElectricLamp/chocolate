package com.by.happy.chocolate.comm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create user:by
 * date:2019/10/21 14:27
 */
@Controller
public class CommController {

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
}

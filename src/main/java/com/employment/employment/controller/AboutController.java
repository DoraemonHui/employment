package com.employment.employment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jianghui
 * @date 2018/5/31 上午12:53
 */

@Controller
public class AboutController {
    @GetMapping("about")
    public String getAboutPage(){
        return "about";
    }
}

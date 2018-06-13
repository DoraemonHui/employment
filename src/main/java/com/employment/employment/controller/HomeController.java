package com.employment.employment.controller;

import com.employment.employment.business.HomeBusiness;
import com.employment.employment.business.impl.HomeBusinessImpl;
import com.employment.employment.business.impl.JobBusinessImpl;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 * @author jianghui
 * @date 2018/5/29 下午6:21
 */

@Controller
public class HomeController {

    @Autowired
    private HomeBusinessImpl homeBusinessImpl;

    @Autowired
    private JobBusinessImpl jobBusinessImpl;


    @GetMapping({"","/home"})
    public String returnHomePage(Model model){
        model.addAttribute("jobs",jobBusinessImpl.queryJobInfoByPage(0));
        return "home";
    }
}

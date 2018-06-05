package com.employment.employment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jianghui
 * @date 2018/5/31 上午12:46
 */

@Controller
public class StatisticsController {
    @GetMapping("statistics")
    public String getStatisticsPage(){
        return "statistics";
    }
}

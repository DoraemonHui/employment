package com.employment.employment.controller;

import com.employment.employment.business.impl.JobBusinessImpl;
import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jianghui
 * @date 2018/6/6 下午5:38
 */

@RestController
public class TestController {
    @Autowired
    private JobBusinessImpl jobBusinessImpl;

    @Autowired
    private JobRepository jobRepository;

    //    @GetMapping("/find")
//    public List<JobInfo> find(){
//        return jobRepository.findAll();
//    }

    @GetMapping("/test")
    public List<JobInfo> test(){

        return jobRepository.findJobInfoByTitleLikeIgnoreCase("Teacher");

    }
}

package com.employment.employment.controller;

import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

/**
 * @author jianghui
 * @date 2018/5/26 下午4:49
 */

@RestController
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/find")
    public List<JobInfo> find(){
        return jobRepository.findAll();
    }


}

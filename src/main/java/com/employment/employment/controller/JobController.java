package com.employment.employment.controller;

import com.employment.employment.business.impl.JobBusinessImpl;
import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jianghui
 * @date 2018/5/26 下午4:49
 */

@Controller
public class JobController {

    @Autowired
    private JobBusinessImpl jobBusinessImpl;

    @GetMapping("/{page}")
    public String test(@PathVariable("page") int page, Model model){

        model.addAttribute("jobs",jobBusinessImpl.queryJobInfoByPage(page));
        return "home";
    }
}

package com.employment.employment.business.impl;

import com.employment.employment.business.JobBusiness;
import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jianghui
 * @date 2018/6/6 下午3:58
 */

@Service
public class JobBusinessImpl implements JobBusiness{
    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<JobInfo> queryJobInfoByPage(int page){

        Pageable pageable = new PageRequest(page,10);

        List<JobInfo> jobs = jobRepository.findAll(pageable).getContent();

        return jobs;
    }

    @Override
    public int getTotalPages(){
        Pageable pageable = new PageRequest(0,10);

        int page = jobRepository.findAll(pageable).getTotalPages();



        return page;
    }
}

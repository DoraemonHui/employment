package com.employment.employment.business.impl;

import com.employment.employment.business.HomeBusiness;
import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jianghui
 * @date 2018/6/5 下午10:31
 */

@Service
public class HomeBusinessImpl implements HomeBusiness {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<JobInfo> queryAllJobInfo(){
        return jobRepository.findAll();
    }
}

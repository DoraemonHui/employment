package com.employment.employment.business.impl;

import com.employment.employment.business.SearchBusiness;
import com.employment.employment.entity.JobInfo;
import com.employment.employment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jianghui
 * @date 2018/6/13 上午9:36
 */

@Service
public class SearchBusinessImpl implements SearchBusiness {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<JobInfo> searchJobInfo(String string){

        List<JobInfo> jobs = jobRepository.findJobInfoByTitleLikeIgnoreCase(string);

        return jobs;
    }
}

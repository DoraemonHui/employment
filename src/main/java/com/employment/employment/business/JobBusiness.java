package com.employment.employment.business;

import com.employment.employment.entity.JobInfo;

import java.util.List;

public interface JobBusiness {

    List<JobInfo> queryJobInfoByPage(int page);

    int getTotalPages();

}

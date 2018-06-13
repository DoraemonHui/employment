package com.employment.employment.business;

import com.employment.employment.entity.JobInfo;

import java.util.List;

public interface SearchBusiness {

    List<JobInfo> searchJobInfo(String string);
}

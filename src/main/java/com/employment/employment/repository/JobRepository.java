package com.employment.employment.repository;

import com.employment.employment.entity.JobInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface JobRepository extends MongoRepository<JobInfo,String> {
    List<JobInfo> findJobInfoByTitleLikeIgnoreCase(String string);
}

package com.employment.employment.repository;

import com.employment.employment.entity.JobInfo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JobRepository extends MongoRepository<JobInfo,String> {

}

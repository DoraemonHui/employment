package com.employment.employment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author jianghui
 * @date 2018/5/26 下午4:30
 */

@Document(collection="Jobs")
public class JobInfo {
    @Id
    private String id;

    private String origin;

    private String job_location;

    private String min_salary;

    private String job_type;

    private String url;

    private String max_salary;

    private String job_update_time;

    private String title;

    private String crawl_time;

    public JobInfo(){

    }

    public String getCrawl_time() {
        return crawl_time;
    }

    public String getOrigin() {
        return origin;
    }

    public String getJob_location() {
        return job_location;
    }

    public String getMin_salary() {
        return min_salary;
    }

    public String getJob_type() {
        return job_type;
    }

    public String getUrl() {
        return url;
    }

    public String getMax_salary() {
        return max_salary;
    }

    public String getJob_update_time() {
        return job_update_time;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }


}

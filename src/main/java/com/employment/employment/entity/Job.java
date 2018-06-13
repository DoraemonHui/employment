package com.employment.employment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author jianghui
 * @date 2018/6/11 下午9:35
 */

@Document(indexName="job",type="job")
public class Job implements Serializable {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String origin;

    private String job_location;

    private String min_salary;

    private String job_type;

    private String url;

    private String max_salary;

    private String job_update_time;

    private String title;

    private String crawl_time;

    private String job_category;

    private String company_name;

    private String work_experience;

    private String degree_needed;

    private  String job_desc;

    public Job(){

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

    public String getJob_category() {
        return job_category;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getWork_experience() {
        return work_experience;
    }

    public String getDegree_needed() {
        return degree_needed;
    }

    public String getJob_desc() {
        return job_desc;
    }
}

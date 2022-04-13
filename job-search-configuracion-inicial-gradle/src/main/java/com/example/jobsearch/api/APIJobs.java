package com.example.jobsearch.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIJobs {
    //here is where we will do our request
    @RequestLine("Get /position.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);
}

package com.example.jobsearch.api;

import com.google.gson.Gson;
import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    //here we're gonna to generate a method to consume an api
    static <T> T buildAPI(Class<T> clazz, String url){
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}

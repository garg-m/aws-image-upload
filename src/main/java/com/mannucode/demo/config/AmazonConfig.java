package com.mannucode.demo.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;


public class AmazonConfig {
    
    public AmazonS3 s3() {
        AWSCredentials awscCredentials = new BasicAWSCredentials(
            "  ", 
            ""
        );

    return AmazonS3ClientBuilder
        .standard()
        .withCredentials(new AWSStaticCredentialsProvider(awscCredentials))
        .build();

    }
}

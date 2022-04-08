package com.yeahbutstill.junit.springin5step.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}") // from property file external.service.url
    private String url;

    public String returnServiceURL() {
        return url;
    }

}

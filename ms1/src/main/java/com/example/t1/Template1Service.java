package com.example.t1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Template1Service {
    @Autowired
    private Template1Repository repository;
    @Autowired
    private RestTemplate restTemplate;


    protected ResponseEntity<?> get() {
        List<Template1> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    public ResponseEntity<?> getFromMS2() {
        Template1 template1 = restTemplate.getForObject("http://localhost:9091/ms2/api/v1/template", Template1.class);
        if (template1 == null) {
            template1 = new Template1();
        }
        return ResponseEntity.ok(template1);
    }
}

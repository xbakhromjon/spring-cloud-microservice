package com.example.t1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Template1Service {
    @Autowired
    private Template1Repository repository;

    protected Template1 get() {
        List<Template1> list = repository.findAll();
        return (list.size() != 0) ? list.get(0) : null;
    }
}

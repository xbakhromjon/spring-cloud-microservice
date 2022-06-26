package com.example.service;

import com.example.dto.BaseDTO;
import com.example.dto.GenericDTO;
import com.example.response.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public interface GenericCUDService<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> {
    ResponseEntity<Data<Void>> create(CD DTO);

    ResponseEntity<Data<Void>> update(UD DTO);

    ResponseEntity<Data<Void>> delete(K key);
}

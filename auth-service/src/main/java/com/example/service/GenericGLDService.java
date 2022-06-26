package com.example.service;


import com.example.criteria.BaseCriteria;
import com.example.dto.GenericDTO;
import com.example.response.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericGLDService<GD extends GenericDTO, DD extends GenericDTO, CR extends BaseCriteria, K extends Serializable> {
    ResponseEntity<Data<GD>> get(K key);

    ResponseEntity<Data<DD>> detail(K key);

    ResponseEntity<Data<List<GD>>> list(CR criteria);
}

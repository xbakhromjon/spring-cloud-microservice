package com.example.service;


import com.example.mapper.BaseMapper;
import com.example.repository.BaseRepository;
import com.example.validator.BaseValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractService<V extends BaseValidator, M extends BaseMapper, R extends BaseRepository> implements BaseService {
    protected final V validator;
    protected final M mapper;
    protected final R repository;
}

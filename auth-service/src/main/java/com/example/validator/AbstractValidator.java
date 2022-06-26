package com.example.validator;


import com.example.dto.BaseDTO;
import com.example.dto.GenericDTO;
import com.example.exception.exception.InvalidValidationException;

import java.io.Serializable;

public abstract class
AbstractValidator<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> implements BaseValidator {
    public abstract void validOnCreate(CD cd) throws InvalidValidationException;

    public abstract void validOnUpdate(UD ud) throws InvalidValidationException;

    public abstract void validateKey(K id) throws InvalidValidationException;
}

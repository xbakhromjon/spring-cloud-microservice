package com.example.validator.auth.token;


import com.example.dto.token.AuthTokenCreateDTO;
import com.example.dto.token.AuthTokenUpdateDTO;
import com.example.exception.exception.InvalidValidationException;
import com.example.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class AuthTokenValidator extends AbstractValidator<AuthTokenCreateDTO, AuthTokenUpdateDTO, UUID> {
    @Override
    public void validOnCreate(AuthTokenCreateDTO authTokenCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(authTokenCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(AuthTokenUpdateDTO cd) throws InvalidValidationException {
        if (Objects.isNull(cd)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}

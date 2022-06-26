package com.example.mapper.auth.token;

import com.example.dto.token.AuthTokenCreateDTO;
import com.example.dto.token.AuthTokenDetailDTO;
import com.example.dto.token.AuthTokenGetDTO;
import com.example.dto.token.AuthTokenUpdateDTO;
import com.example.entity.auth.token.AuthToken;
import com.example.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthTokenMapper extends GenericMapper<AuthTokenCreateDTO, AuthTokenUpdateDTO, AuthTokenGetDTO, AuthTokenDetailDTO, AuthToken> {
}

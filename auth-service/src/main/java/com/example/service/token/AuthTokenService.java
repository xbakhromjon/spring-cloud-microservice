package com.example.service.token;



import com.example.criteria.auth.token.AuthTokenCriteria;
import com.example.dto.token.AuthTokenCreateDTO;
import com.example.dto.token.AuthTokenDetailDTO;
import com.example.dto.token.AuthTokenGetDTO;
import com.example.dto.token.AuthTokenUpdateDTO;
import com.example.service.GenericCUDService;
import com.example.service.GenericGLDService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public interface AuthTokenService extends GenericCUDService<AuthTokenCreateDTO, AuthTokenUpdateDTO, UUID>, GenericGLDService<AuthTokenGetDTO, AuthTokenDetailDTO, AuthTokenCriteria, UUID> {
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}

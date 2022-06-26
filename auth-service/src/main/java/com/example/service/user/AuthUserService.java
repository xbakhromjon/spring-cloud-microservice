package com.example.service.user;


import com.example.criteria.auth.user.AuthUserCriteria;
import com.example.dto.user.AuthUserCreateDTO;
import com.example.dto.user.AuthUserDetailDTO;
import com.example.dto.user.AuthUserGetDTO;
import com.example.dto.user.AuthUserUpdateDTO;
import com.example.service.GenericCUDService;
import com.example.service.GenericGLDService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface AuthUserService extends GenericCUDService<AuthUserCreateDTO, AuthUserUpdateDTO, UUID>, GenericGLDService<AuthUserGetDTO, AuthUserDetailDTO, AuthUserCriteria, UUID>, UserDetailsService {
}

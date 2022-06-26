package com.example.mapper.auth.user;


import com.example.dto.user.AuthUserCreateDTO;
import com.example.dto.user.AuthUserDetailDTO;
import com.example.dto.user.AuthUserGetDTO;
import com.example.dto.user.AuthUserUpdateDTO;
import com.example.entity.auth.user.AuthUser;
import com.example.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthUserMapper extends GenericMapper<AuthUserCreateDTO, AuthUserUpdateDTO, AuthUserGetDTO, AuthUserDetailDTO, AuthUser> {
}

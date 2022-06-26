package com.example.criteria.auth.user;


import com.example.criteria.GenericCriteria;
import com.example.enums.auth.user.AuthUserFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class AuthUserCriteria extends GenericCriteria {
    private AuthUserFieldsEnum fieldsEnum;
}

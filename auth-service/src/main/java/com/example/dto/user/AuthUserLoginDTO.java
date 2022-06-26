package com.example.dto.user;


import com.example.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserLoginDTO implements BaseDTO {
    @NotBlank(message = "{user.username.required}")
    private String username;
    @NotBlank(message = "{user.password.required}")
    private String password;
}

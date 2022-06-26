package com.example.dto.user;


import com.example.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserGetDTO extends GenericDTO {
    private String username;
    private String password;
    private String email;
    private String image;
    private String language;
    private String status;
}

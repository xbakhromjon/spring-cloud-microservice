package com.example.dto.token;


import com.example.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenGetDTO extends GenericDTO {
    private String type;
    private String token;
}

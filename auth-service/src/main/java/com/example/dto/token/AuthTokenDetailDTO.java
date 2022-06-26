package com.example.dto.token;


import com.example.dto.GenericDTO;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenDetailDTO extends GenericDTO {
    private UUID userCode;
    private String token;
    private Date duration;
    private String type;
}

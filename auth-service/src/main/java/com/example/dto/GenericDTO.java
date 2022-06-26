package com.example.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GenericDTO implements BaseDTO {
    private UUID code;
}

package com.springboot.appt.payload;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OwnerDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String url;
}

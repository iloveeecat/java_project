package com.example.java_project.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    public Long id;
    public double wallet;
    private String email;
    private String password;
    public String firstName;
    public String lastName;
}

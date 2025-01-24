package ru.javaops.bootjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class User {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private Set<Role> roles;
}
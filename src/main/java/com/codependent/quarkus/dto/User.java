package com.codependent.quarkus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private final int id;
    private String name;

}

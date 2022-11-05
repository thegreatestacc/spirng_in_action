package com.example.springbootinaction.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long.")
    String name;
    @Size(min = 1, message = "You must chose at least 1 ingredient.")
    List<String> ingredients;
}

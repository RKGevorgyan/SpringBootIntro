package com.example.springbootintro.model.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

// POJO
public class PersonDto {
    private Long id;

    @NotNull
    @Length(max = 255)
    @NotBlank
    private String name;

    @Max(100)
    @Min(1)
    private Integer age;

    @Pattern(regexp = "([A-z0-9_.-]{1,})@([A-z0-9_.-]{1,}).([A-z]{2,8})")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

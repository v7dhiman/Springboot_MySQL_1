package com.example.demo2.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@Builder
@AllArgsConstructor
@ToString
public class CreatePersonRequest
{
    @NotBlank(message = "First name should not be empty")
    private String firstName;
    private String lastName;
    @NotBlank(message = "DOB should not be empty")
    private String dob;
}

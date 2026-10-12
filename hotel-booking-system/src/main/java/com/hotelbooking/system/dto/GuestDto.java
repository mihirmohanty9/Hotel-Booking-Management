package com.hotelbooking.system.dto;

import com.hotelbooking.system.entity.User;
import com.hotelbooking.system.entity.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {

    @NotBlank(message = "Guest name is required")
    @Size(min = 2, max = 100, message = "Guest name must be between 2 and 100 characters")
    private String name;

    @NotNull(message = "Gender is required")
    private Gender gender;

    private LocalDate dateOfBirth;
}
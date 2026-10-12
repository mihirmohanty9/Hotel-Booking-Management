package com.hotelbooking.system.dto;

import com.hotelbooking.system.entity.HotelContactInfo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class HotelDto {

    private Long id;

    @NotBlank(message = "Hotel name is required")
    @Size(min = 3, max = 100, message = "Hotel name must be between 3 and 100 characters")
    private String name;

    @NotBlank(message = "City is required")
    private String city;

    private String[] photos;

    private String[] amenities;

    @Valid
    private HotelContactInfo contactInfo;

    private Boolean active;
}


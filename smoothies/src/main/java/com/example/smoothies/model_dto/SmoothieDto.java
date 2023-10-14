package com.example.smoothies.model_dto;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder(toBuilder=true)
public class SmoothieDto implements Serializable {

    Long id;
    String name;
    String description;
    NutritionDto nutritions;
}


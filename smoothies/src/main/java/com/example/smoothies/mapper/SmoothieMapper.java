package com.example.smoothies.mapper;

import com.example.smoothies.model_dto.NutritionDto;
import com.example.smoothies.model_dto.SmoothieDto;
import com.example.smoothies.repository.Smoothie;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmoothieMapper {

    public SmoothieDto mapEntityToDto(Smoothie smoothie) {
        return SmoothieDto.builder()
                .id(smoothie.getId())
                .name(smoothie.getName())
                .description(smoothie.getDescription())
                .nutritions(NutritionDto.builder()
                        .kcal(smoothie.getKcal())
                        .fat(smoothie.getFat())
                        .saturates(smoothie.getSaturates())
                        .carbs(smoothie.getCarbs())
                        .sugars(smoothie.getSugars())
                        .fibre(smoothie.getFibre())
                        .protein(smoothie.getProtein())
                        .salt(smoothie.getSalt())
                        .build())
                .build();

    }
    public List<SmoothieDto> mapEntitiesToDtos(List<Smoothie> smoothies) {
        List<SmoothieDto> dtos = new ArrayList<>();
        smoothies.forEach(smoothie -> dtos.add(mapEntityToDto(smoothie)));
      return dtos;
    }

    public Smoothie mapDtoToEntity(SmoothieDto dto) {
        Smoothie entity = Smoothie.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription()).build();

        if (!ObjectUtils.isEmpty(dto.getNutritions())) {
            return entity.toBuilder()
                    .kcal(dto.getNutritions().getKcal())
                    .fat(dto.getNutritions().getFat())
                    .saturates(dto.getNutritions().getSaturates())
                    .carbs(dto.getNutritions().getCarbs())
                    .sugars(dto.getNutritions().getSugars())
                    .fibre(dto.getNutritions().getFibre())
                    .protein(dto.getNutritions().getProtein())
                    .salt(dto.getNutritions().getSalt())
                    .build();
        }
        return entity;
    }
}

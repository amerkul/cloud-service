package com.example.cloud.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDto {

    private Long id;
    private String name;
    private String category;
    private String color;
    private Integer price;

}

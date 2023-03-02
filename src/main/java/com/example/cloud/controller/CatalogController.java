package com.example.cloud.controller;

import com.example.cloud.controller.dto.CatalogDto;
import com.example.cloud.controller.util.MapperUtil;
import com.example.cloud.domain.Catalog;
import com.example.cloud.service.CatalogService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/catalog")
public class CatalogController {

    private final CatalogService service;
    private final MapperUtil mapperUtil;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public CatalogDto create(@RequestBody CatalogDto dto) {
        service.insertItem(mapperUtil.entityBuilder(dto, Catalog.class));
        return dto;
    }

    @GetMapping(value = "/all", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CatalogDto> getAll() {
        List<Catalog> catalogs = service.retrieveAll();
        return MapperUtil.convertList(catalogs, catalog -> mapperUtil.dtoBuilder(catalog, CatalogDto.class));
    }

}

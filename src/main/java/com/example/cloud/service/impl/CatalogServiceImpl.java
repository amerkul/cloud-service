package com.example.cloud.service.impl;

import com.example.cloud.domain.Catalog;
import com.example.cloud.repository.CatalogRepository;
import com.example.cloud.service.CatalogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository repository;

    @Override
    public void insertItem(Catalog catalog) {
        repository.save(catalog);
    }

    @Override
    public List<Catalog> retrieveAll() {
        return repository.findAll();
    }

}

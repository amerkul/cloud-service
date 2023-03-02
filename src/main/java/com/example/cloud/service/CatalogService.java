package com.example.cloud.service;

import com.example.cloud.domain.Catalog;

import java.util.List;

public interface CatalogService {

    void insertItem(Catalog catalog);
    List<Catalog> retrieveAll();

}

package com.example.cloud.controller.util;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public final class MapperUtil {

    private final ModelMapper mapper;

    public static <R, E> List<R> convertList(List<E> list, Function<E, R> converter) {
        return list.stream().map(e -> converter.apply(e)).collect(Collectors.toList());
    }

    public <T,R> R entityBuilder(T dto, Class<R> entityClass) {
        return mapper.map(dto, entityClass);
    }

    public <T,R> R dtoBuilder(T entity, Class<R> dtoClass) {
        return mapper.map(entity, dtoClass);
    }

}

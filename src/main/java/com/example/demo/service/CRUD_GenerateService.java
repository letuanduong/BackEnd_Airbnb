package com.example.demo.service;

import java.util.List;
import java.util.Optional;

public interface CRUD_GenerateService<T> {
    List<T> findAll();
    Optional<T> findById();
    Optional<T> findByName();
    boolean save(T t);
    boolean deleteById(int id);
    boolean deleteByObject(T t);
    boolean updateById(int id);
    boolean updateByObject(T t);
}

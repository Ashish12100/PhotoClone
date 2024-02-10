package com.example.PhotoClone.repository;

import com.example.PhotoClone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
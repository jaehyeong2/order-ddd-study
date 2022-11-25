package com.example.order.global.util;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.NoSuchElementException;

public class DbUtils {
    public static <T> T findOrThrow(JpaRepository<T,Long> repository, Long id){
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}

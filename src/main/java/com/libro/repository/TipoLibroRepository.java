package com.libro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libro.entity.TipoLibro;

public interface TipoLibroRepository extends JpaRepository<TipoLibro, Integer> {

}

package com.sesi.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.crudapp.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

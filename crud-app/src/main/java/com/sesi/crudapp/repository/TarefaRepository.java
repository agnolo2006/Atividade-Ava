package com.sesi.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.crudapp.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}

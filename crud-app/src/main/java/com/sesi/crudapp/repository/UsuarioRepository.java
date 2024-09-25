package com.sesi.crudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.crudapp.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

	List<Usuario> findAll();

	List<Usuario> findAll1();

	Usuario save(Usuario usuario);

}

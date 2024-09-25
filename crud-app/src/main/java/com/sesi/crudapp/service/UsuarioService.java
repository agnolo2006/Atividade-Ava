package com.sesi.crudapp.service;

import com.sesi.crudapp.model.Usuario;
import com.sesi.crudapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findAll().orElse(null);
    }
}	

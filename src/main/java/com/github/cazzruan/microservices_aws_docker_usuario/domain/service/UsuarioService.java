package com.github.cazzruan.microservices_aws_docker_usuario.domain.service;

import com.github.cazzruan.microservices_aws_docker_usuario.domain.model.Usuario;
import com.github.cazzruan.microservices_aws_docker_usuario.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findById(Long usuarioId) {
        return usuarioRepository.findById(usuarioId).get();
    }

    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

package com.github.cazzruan.microservices_aws_docker_usuario.domain.repository;

import com.github.cazzruan.microservices_aws_docker_usuario.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

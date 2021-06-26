package com.github.cazzruan.microservices_aws_docker_usuario.api.v1.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    private String nome;
}

package com.github.cazzruan.microservices_aws_docker_usuario.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "alugantes")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}

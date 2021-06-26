package com.github.cazzruan.microservices_aws_docker_usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.github.cazzruan.microservices_aws_docker_usuario.*")
@EnableJpaRepositories(basePackages = "com.github.cazzruan.microservices_aws_docker_usuario.domain.repository")
@EntityScan(basePackages = "com.github.cazzruan.microservices_aws_docker_usuario.domain.model")
@SpringBootApplication
public class MicroservicesAwsDockerUsuarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesAwsDockerUsuarioApplication.class, args);
    }

}

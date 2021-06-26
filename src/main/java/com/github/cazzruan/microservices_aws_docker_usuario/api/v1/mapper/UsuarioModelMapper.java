package com.github.cazzruan.microservices_aws_docker_usuario.api.v1.mapper;

import com.github.cazzruan.microservices_aws_docker_usuario.api.v1.request.UsuarioRequest;
import com.github.cazzruan.microservices_aws_docker_usuario.api.v1.response.UsuarioResponse;
import com.github.cazzruan.microservices_aws_docker_usuario.domain.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsuarioModelMapper {

    private ModelMapper modelMapper;

    public UsuarioModelMapper (ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public Usuario toEntity (UsuarioRequest usuarioRequest) {
        return modelMapper.map(usuarioRequest, Usuario.class);
    }

    public void copyToEntity(UsuarioRequest usuarioRequest, Usuario usuario) {
        modelMapper.map(usuarioRequest, usuario);

    }

    public UsuarioResponse toModel(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioResponse.class);
    }

    public List<UsuarioResponse> toCollectionModel(List<Usuario> usuarios) {
        return usuarios
                .stream()
                .map(usuario -> toModel(usuario))
                .collect(Collectors.toList());
    }
}

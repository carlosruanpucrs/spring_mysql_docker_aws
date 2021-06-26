package com.github.cazzruan.microservices_aws_docker_usuario.api.v1.controller;

import com.github.cazzruan.microservices_aws_docker_usuario.api.v1.mapper.UsuarioModelMapper;
import com.github.cazzruan.microservices_aws_docker_usuario.api.v1.request.UsuarioRequest;
import com.github.cazzruan.microservices_aws_docker_usuario.api.v1.response.UsuarioResponse;
import com.github.cazzruan.microservices_aws_docker_usuario.domain.model.Usuario;
import com.github.cazzruan.microservices_aws_docker_usuario.domain.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/alugantes")
public class UsuarioResource {

    private UsuarioService usuarioService;
    private UsuarioModelMapper usuarioModelMapper;

    public UsuarioResource(UsuarioService usuarioService, UsuarioModelMapper usuarioModelMapper) {
        this.usuarioService = usuarioService;
        this.usuarioModelMapper = usuarioModelMapper;
    }
    
    @GetMapping("/teste")
    public String teste(){
        return "teste funcionou!";
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<UsuarioResponse> findAluganteById(@PathVariable Long usuarioId){
        UsuarioResponse usuarioResponse = usuarioModelMapper.toModel(usuarioService.findById(usuarioId));
        return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> create(@RequestBody UsuarioRequest usuarioRequest){
        Usuario usuario = usuarioModelMapper.toEntity(usuarioRequest);
        UsuarioResponse usuarioResponse = usuarioModelMapper.toModel(usuarioService.create(usuario));
        return new ResponseEntity<>(usuarioResponse, HttpStatus.CREATED);
    }

}

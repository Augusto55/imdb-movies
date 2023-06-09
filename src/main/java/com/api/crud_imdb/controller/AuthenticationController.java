package com.api.crud_imdb.controller;

import com.api.crud_imdb.domains.DadosAutenticacao;
import com.api.crud_imdb.domains.User;
import com.api.crud_imdb.infra.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody DadosAutenticacao dados){
        var token = new UsernamePasswordAuthenticationToken(dados.login(), dados.password());
        var authentication = manager.authenticate(token);

        String tokenJwt = tokenService.generateToken((User) authentication.getPrincipal());
        return ResponseEntity.ok(new DadosTokenJwt(tokenJwt));
    }
}

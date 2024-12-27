package br.com.alura.controller;


import br.com.alura.domain.security.DadosTokenJWT;
import br.com.alura.domain.usuario.DadosAutenticacao;
import br.com.alura.domain.usuario.Usuario;
import br.com.alura.domain.security.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AutenticacaoController {

    @RestController
    @RequestMapping("/login")
    public class AutenticacaoControler {

        @Autowired
        private AuthenticationManager manager;

        @Autowired
        private TokenService tokenService;


        @PostMapping
        public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
            var authenticationtoken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
            var authentication = manager.authenticate(authenticationtoken);

            var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

            return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
        }
    }
}

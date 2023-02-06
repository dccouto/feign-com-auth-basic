package br.com.coutech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coutech.service.SsoService;
/**
 * 
 * deletar a classe, usada somente para teste
 * */
@RestController
@RequestMapping("sso-test")
public class testaServicoController {
    
    @Autowired
    private SsoService ssoService;

    
    @GetMapping
    public ResponseEntity<?> getPerfilById(){
        return ResponseEntity.ok(ssoService.buscarPerfilPorId(1086L));
    }
}

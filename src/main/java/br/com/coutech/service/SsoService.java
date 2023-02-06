package br.com.coutech.service;

import org.springframework.stereotype.Service;

import br.com.coutech.dtos.Perfil;
import br.com.coutech.facade.SsoFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class SsoService {

    private final SsoFacade ssoFacade;

    public Perfil buscarPerfilPorId(Long idPerfil) {
        log.info("Consulta ao SSO - Buscar Perfil por idPerfil -> idPerfil: " + idPerfil);
        return ssoFacade.buscaPerfilById(idPerfil, "PCF");      
    }
    
}

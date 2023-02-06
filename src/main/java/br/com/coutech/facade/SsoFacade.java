package br.com.coutech.facade;

import br.com.coutech.dtos.Perfil;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface SsoFacade {

    @RequestLine("GET api/sso/perfil/buscarPerfil?idPerfil={idPerfil}&siglaServico={siglaServico}")
    Perfil buscaPerfilById(@Param("idPerfil") Long idPerfil, @Param("siglaServico") String siglaServico);

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    @RequestLine("POST /perfil")
    PerfilDTO incluirPerfil(PerfilCadastroDTO perfilDTO);

    @RequestLine("PUT /perfil/{id}")
    PerfilDTO alterarPerfil(@Param("id") Long id, PerfilCadastroDTO perfilDTO);

    @RequestLine("GET /perfil/consulta")
    RestResponsePage<PerfilDTO> buscarPerfis(@QueryMap FiltroPerfilDTO dto, Pageable pageable);

    @RequestLine("GET /perfil/buscarTodos")
    List<PerfilDTO> buscarTodosPerfis(@QueryMap FiltroPerfilDTO dto);

    @RequestLine("GET /perfil/buscarPerfil")
    PerfilDTO buscarPerfil(@QueryMap BuscarPerfilDTO buscarPerfilDTO);

    @RequestLine("GET /perfil/buscarPerfilPeloNome")
    PerfilDTO buscarPerfil(@QueryMap BuscarPerfilNomeDTO buscarPerfilDTO);

    @RequestLine("PUT /perfil/ativarOuInativar")
    void ativarInativarPerfil(AtivarInativarPerfilDTO inativarAtivarPerfilDTO);

    @RequestLine("PUT /perfil/ativarPerfisUsuario")
    void ativarPerfisUsuario(AtivarInativarPerfilUsuarioDTO ativarInativarPerfilUsuarioDTO);

    @RequestLine("PUT /perfil/inativarPerfisUsuario")
    void inativarPerfisUsuario(AtivarInativarPerfilUsuarioDTO ativarInativarPerfilUsuarioDTO);

    @RequestLine("GET /perfil/possuiUsuarioVinculado/{id}")
    List<PerfilDTO> perfilPossuiUsuarioVinculado(@Param("id") Long id);

    @RequestLine("GET /perfil/usuarioServico/{cpf}/{servico}")
    List<PerfilDTO> perfisPorUsuarioServico(@Param("cpf") String cpf, @Param("servico") String siglaServico);
    */
}

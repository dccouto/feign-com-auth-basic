package br.com.coutech.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Acao {

    private Long id;

    private String nome;

    private String descricao;

    private Boolean ativo;

    @JsonIgnore
    private List<Perfil> perfis;

}

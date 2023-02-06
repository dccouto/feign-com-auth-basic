package br.com.coutech.dtos;

import java.util.List;

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
public class Perfil {

    private Long id;

    private String nome;

    private String descricao;

    private Boolean ativo;

    private List<Acao> acoes;

    public String getNomeSSO() {
        if (nome != null && nome.contains("-")) {
            String[] n = nome.split("-");
            return n[0].trim();
        }
        return nome;
    }

}

package br.com.tiburski.azure.bff.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DadosEntradaEntity {
    private String id;
    private String tipoEntrada;
    private String tipoSaida;
}

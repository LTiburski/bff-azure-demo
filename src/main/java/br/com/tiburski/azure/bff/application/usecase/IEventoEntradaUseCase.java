package br.com.tiburski.azure.bff.application.usecase;

import br.com.tiburski.azure.bff.domain.DadosEntradaEntity;

public interface IEventoEntradaUseCase {
    void entradaDados(final DadosEntradaEntity dadosEntrada);
}

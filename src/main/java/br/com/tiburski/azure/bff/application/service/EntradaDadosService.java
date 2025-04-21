package br.com.tiburski.azure.bff.application.service;

import br.com.tiburski.azure.bff.application.usecase.IEventoEntradaUseCase;
import br.com.tiburski.azure.bff.domain.DadosEntradaEntity;
import org.springframework.stereotype.Service;

@Service
public class EntradaDadosService implements IEventoEntradaUseCase {

    @Override
    public void entradaDados(DadosEntradaEntity dadosEntrada) {

    }
}

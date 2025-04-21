package br.com.tiburski.azure.bff.port.input;

import br.com.tiburski.azure.bff.domain.DadosEntradaEntity;
import org.springframework.http.ResponseEntity;

public interface IDadosEntradaInput {
    ResponseEntity<Void> entradaDados(final DadosEntradaEntity dadosEntrada);
}

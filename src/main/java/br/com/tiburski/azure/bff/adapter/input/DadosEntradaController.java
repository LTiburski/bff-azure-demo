package br.com.tiburski.azure.bff.adapter.input;

import br.com.tiburski.azure.bff.application.usecase.IEventoEntradaUseCase;
import br.com.tiburski.azure.bff.domain.DadosEntradaEntity;
import br.com.tiburski.azure.bff.port.input.IDadosEntradaInput;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-entrada")
public class DadosEntradaController implements IDadosEntradaInput {

    private IEventoEntradaUseCase useCase;

    @Override
    @PostMapping
    @Operation(summary = "Registrar dados de entrada", description = "Recebe e processa os dados de entrada fornecidos pelo cliente.")
    public ResponseEntity<Void> entradaDados(final DadosEntradaEntity dadosEntrada) {
        useCase.entradaDados(dadosEntrada);
        return ResponseEntity.ok().build();
    }
}

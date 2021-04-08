package br.com.zup.Zupnancas.controller;

import br.com.zup.Zupnancas.models.Credito;
import br.com.zup.Zupnancas.models.Saldo;
import br.com.zup.Zupnancas.services.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("creditos/")
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credito cadastrarCredito(@RequestBody Credito credito){
        return creditoService.cadastrarCredito(credito);
    }

    @GetMapping
    public List<Credito> visualizarTodosOsCreditos(){
        return creditoService.pesquisarTodosOsCreditos();
    }
}

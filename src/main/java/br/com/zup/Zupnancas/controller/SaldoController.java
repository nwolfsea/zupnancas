package br.com.zup.Zupnancas.controller;

import br.com.zup.Zupnancas.models.Saldo;
import br.com.zup.Zupnancas.services.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("saldos/")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Saldo cadastrarSaldo(@RequestBody Saldo saldo){
        return saldoService.cadastrarSaldo(saldo);
    }


}

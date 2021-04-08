package br.com.zup.Zupnancas.controller;


import br.com.zup.Zupnancas.models.Conta;
import br.com.zup.Zupnancas.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("contas/")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta cadastrarConta(@RequestBody Conta conta){
        return contaService.cadastrarConta(conta);
    }


}

package br.com.zup.Zupnancas.controller;

import br.com.zup.Zupnancas.DTO.CreditoDTO;
import br.com.zup.Zupnancas.DTO.FiltroDeCreditosDTO;
import br.com.zup.Zupnancas.controller.request.CreditoRequest;
import br.com.zup.Zupnancas.models.Credito;
import br.com.zup.Zupnancas.services.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("creditos/")
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credito cadastrarCredito(@RequestBody CreditoRequest creditoRequest){
        return creditoService.cadastrarCredito(creditoRequest);
    }


    @GetMapping
    public Iterable<CreditoDTO> pesquisarTodosOsCreditosPorCategoria(@ModelAttribute FiltroDeCreditosDTO filtro ){
        Iterable<Credito> creditos = creditoService.pesquisarTodosOsCreditosPorCategoria(filtro);
        return CreditoDTO.converterIterableDeModelParaDTO(creditos);
    }
}

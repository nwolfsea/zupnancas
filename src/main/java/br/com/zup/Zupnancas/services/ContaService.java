package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.models.Conta;
import br.com.zup.Zupnancas.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Atualizar conta
//Pesquisar Contas Pagas, Aguardando ou Atrasadas.
//
//DELETAR categoria.
@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public Conta cadastrarConta(Conta conta){
        Conta objetoConta = contaRepository.save(conta);
        return objetoConta;
    }
}

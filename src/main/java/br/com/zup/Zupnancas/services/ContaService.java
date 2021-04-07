package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Cadastro Conta
//Atualizar conta
//Pesquisar Contas Pagas, Aguardando ou Atrasadas.
//
//DELETAR categoria.
@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;
}

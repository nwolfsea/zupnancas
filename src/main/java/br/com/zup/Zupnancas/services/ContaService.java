package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.models.Conta;
import br.com.zup.Zupnancas.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//Pesquisar Contas Pagas, Aguardando ou Atrasadas.
//

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public Conta cadastrarConta(Conta conta){
        return contaRepository.save(conta);
    }

    public Conta atualizarConta(Conta conta){
        if (contaRepository.existsById(conta.getId())){
            Conta objConta = cadastrarConta(conta);
            return objConta;
        }
        throw new RuntimeException("Conta não localizada!");
    }
}

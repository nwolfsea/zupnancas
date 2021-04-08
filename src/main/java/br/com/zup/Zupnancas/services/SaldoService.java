package br.com.zup.Zupnancas.services;


import br.com.zup.Zupnancas.repositories.SaldoRepository;
import br.com.zup.Zupnancas.models.Saldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo cadastrarSaldo(Saldo saldo){
        Saldo objetoSaldo = saldoRepository.save(saldo);
        return objetoSaldo;
    }

    public List<Saldo> visualizarSaldo(){
        List<Saldo> saldos = (List<Saldo>)saldoRepository.findAll();
        return saldos;
    }
}

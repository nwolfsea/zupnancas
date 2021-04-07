package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.repositories.SaldoRepository;
import br.com.zup.Zupnancas.models.Saldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo cadastrarSaldo(Saldo saldo){
        Saldo objetoSaldo = saldoRepository.save(saldo);
        return objetoSaldo;
    }

    //public Saldo visualizarSaldo(Saldo saldo){
       // Saldo objSaldo = (Saldo) saldoRepository.findAll(saldo);
        //return objSaldo;
    //}
}

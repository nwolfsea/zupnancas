package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.DTO.FiltroDeCreditosDTO;
import br.com.zup.Zupnancas.controller.request.CreditoRequest;
import br.com.zup.Zupnancas.models.Credito;
import br.com.zup.Zupnancas.models.Saldo;
import br.com.zup.Zupnancas.repositories.CreditoRepository;
import br.com.zup.Zupnancas.repositories.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;
    @Autowired
    private SaldoRepository saldoRepository;

    public Credito cadastrarCredito(CreditoRequest creditoRequest){
        Credito objCredito = criarCredito(creditoRequest);
        Saldo objSaldo = buscarSaldo(creditoRequest.getCpf());
        Saldo objSaldoAtualizado = atualizarSaldo(objSaldo, creditoRequest.getValor());
        objCredito.setSaldo(objSaldoAtualizado);
        return creditoRepository.save(objCredito);
    }

    public Credito criarCredito(CreditoRequest creditoRequest){
        Credito objCredito = new Credito();
        objCredito.setDataDeEntrada(LocalDate.now());
        objCredito.setValor(creditoRequest.getValor());
        objCredito.setDescricao(creditoRequest.getDescricao());

        return objCredito;
    }

    public Saldo buscarSaldo(String cpf){
        Optional<Saldo> objSaldo = saldoRepository.findById(cpf);
        if(objSaldo.isPresent()){
            return objSaldo.get();
        }else{
            throw new RuntimeException("Saldo não existe!");
        }
    }

    public Saldo atualizarSaldo(Saldo objSaldo, Double valor){
        Double valorAtualizado = valor+objSaldo.getValor();
        objSaldo.setValor(valorAtualizado);
        objSaldo.setLimite(valorAtualizado);
        return saldoRepository.save(objSaldo);
    }

    public List<Credito> pesquisarTodosOsCreditos(){
        List<Credito> creditos = (List<Credito>) creditoRepository.findAll();
        return creditos;
    }

    public Iterable<Credito> pesquisarTodosOsCreditosPorCategoria(FiltroDeCreditosDTO filtro){
        if(filtro.getNome() == null){
            return creditoRepository.findAll();
        }
        return creditoRepository.findAllByCategoriasNome(filtro.getNome());
    }

}

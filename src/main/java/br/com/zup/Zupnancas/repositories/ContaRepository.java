package br.com.zup.Zupnancas.repositories;

import br.com.zup.Zupnancas.enuns.StatusEnum;
import br.com.zup.Zupnancas.models.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta,Integer> {
    Iterable<Conta> findAllByStatus(StatusEnum status);
}




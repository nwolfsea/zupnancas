package br.com.zup.Zupnancas.repositories;

import br.com.zup.Zupnancas.models.Categoria;
import br.com.zup.Zupnancas.models.Credito;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CreditoRepository extends CrudRepository<Credito,Integer> {
    Iterable<Credito> findByCategoria(List<Categoria> categorias);
}

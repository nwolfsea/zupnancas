package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.DTO.FiltroDeCreditosDTO;
import br.com.zup.Zupnancas.models.Credito;
import br.com.zup.Zupnancas.repositories.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//Pesquisar Todos os Creditos por Categoria
@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public Credito cadastrarCredito(Credito credito){
        Credito objetoCredito = creditoRepository.save(credito);
        return objetoCredito;
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

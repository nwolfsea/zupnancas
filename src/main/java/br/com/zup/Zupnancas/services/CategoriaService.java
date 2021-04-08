package br.com.zup.Zupnancas.services;

import br.com.zup.Zupnancas.models.Categoria;
import br.com.zup.Zupnancas.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria(Categoria categoria){
        Categoria objetoCategoria = categoriaRepository.save(categoria);
        return objetoCategoria;
    }

    public List<Categoria> visualizarCategoriasCadastradas(){
        List<Categoria> categorias = (List<Categoria>) categoriaRepository.findAll();
        return categorias;
    }

    public void deletarCategoria(int id){
        categoriaRepository.deleteById(id);
    }

}

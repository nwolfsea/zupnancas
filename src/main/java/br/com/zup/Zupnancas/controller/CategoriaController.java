package br.com.zup.Zupnancas.controller;


import br.com.zup.Zupnancas.models.Categoria;
import br.com.zup.Zupnancas.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("categorias/")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria cadastrarCategoria(@RequestBody @Valid Categoria categoria){
        return categoriaService.cadastrarCategoria(categoria);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> visualizarCategoriasCadastradas(){
        return categoriaService.visualizarCategoriasCadastradas();
    }

    @DeleteMapping("{id}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletearCategoria(@PathVariable int id){
        categoriaService.deletarCategoria(id);
    }
}

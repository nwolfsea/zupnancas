package br.com.zup.Zupnancas.DTO;


import br.com.zup.Zupnancas.models.Categoria;

import java.util.List;

public class FiltroDeCreditosDTO {

    private List<Categoria> categorias;

    public FiltroDeCreditosDTO() {
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}

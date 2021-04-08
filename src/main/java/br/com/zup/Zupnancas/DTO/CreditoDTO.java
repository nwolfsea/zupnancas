package br.com.zup.Zupnancas.DTO;

import br.com.zup.Zupnancas.models.Categoria;
import br.com.zup.Zupnancas.models.Credito;
import br.com.zup.Zupnancas.models.Saldo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditoDTO {

    private int id;
    private Double valor;
    private String descricao;
    private LocalDate dataDeEntrada;
    private Saldo saldo;
    private List<Categoria> categorias;

    public CreditoDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Credito converterDTOParaModel(){
        Credito credito = new Credito();

        credito.setId(this.id);
        credito.setValor(this.valor);
        credito.setDescricao(this.descricao);
        credito.setDataDeEntrada(this.dataDeEntrada);

        return credito;
    }

    public static Iterable<CreditoDTO> converterIterableDeModelParaDTO(Iterable<Credito> creditos){
        List<CreditoDTO> creditoDTO = new ArrayList<>();

        for(Credito credito: creditos){
            creditoDTO.add(converterModelParaDTO(credito));
        }

        return creditoDTO;
    }

    public static CreditoDTO converterModelParaDTO(Credito credito){
        CreditoDTO creditoDTO = new CreditoDTO();

        creditoDTO.setId(credito.getId());
        credito.setValor(credito.getValor());
        credito.setDescricao(credito.getDescricao());
        credito.setDataDeEntrada(credito.getDataDeEntrada());


        return creditoDTO;
    }
}

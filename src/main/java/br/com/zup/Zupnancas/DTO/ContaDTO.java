package br.com.zup.Zupnancas.DTO;

import br.com.zup.Zupnancas.enuns.StatusEnum;
import br.com.zup.Zupnancas.models.Conta;
import br.com.zup.Zupnancas.models.Saldo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaDTO {

    private int id;
    private Double valor;
    private String descricao;
    private LocalDate dataDeEntrada;
    private LocalDate dataDeVencimento;
    private StatusEnum status;
    private Saldo saldo;

    public ContaDTO() {
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

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Conta converterDTOParaModel(){
        Conta conta = new Conta();

        conta.setId(this.id);
        conta.setValor(this.valor);
        conta.setDescricao(this.descricao);
        conta.setDataDeEntrada(this.dataDeEntrada);
        conta.setDataDeVencimento(this.dataDeVencimento);
        conta.setStatus(this.status);

        return conta;
    }

    public static Iterable<ContaDTO> converterIterableDeModelParaDTO(Iterable<Conta> contas){
        List<ContaDTO> contaDTOS = new ArrayList<>();

        for(Conta conta: contas){
            contaDTOS.add(converterModelParaDTO(conta));
        }

        return contaDTOS;
    }

    public static ContaDTO converterModelParaDTO(Conta conta){
        ContaDTO contaDTO = new ContaDTO();

        conta.setId(conta.getId());
        conta.setValor(conta.getValor());
        conta.setDescricao(conta.getDescricao());
        conta.setDataDeEntrada(conta.getDataDeEntrada());
        conta.setDataDeVencimento(conta.getDataDeVencimento());
        conta.setStatus(conta.getStatus());


        return contaDTO;
    }
}

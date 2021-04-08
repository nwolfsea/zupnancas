package br.com.zup.Zupnancas.DTO;

import br.com.zup.Zupnancas.enuns.StatusEnum;
import br.com.zup.Zupnancas.models.Conta;



import java.time.LocalDate;

public class ContaDTO {

    private int id;
    private Double valor;
    private String descricao;
    private LocalDate dataDeEntrada;
    private LocalDate dataDeVencimento;
    private StatusEnum status;

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

    public static ContaDTO conveterModelParaDTO(Conta conta){
        ContaDTO contaDTO = new ContaDTO();

        contaDTO.setId(conta.getId());
        contaDTO.setValor(conta.getValor());
        contaDTO.setDescricao(conta.getDescricao());
        contaDTO.setDataDeEntrada(conta.getDataDeEntrada());
        contaDTO.setDataDeVencimento(conta.getDataDeVencimento());
        contaDTO.setStatus(conta.getStatus());

        return contaDTO;
    }
}

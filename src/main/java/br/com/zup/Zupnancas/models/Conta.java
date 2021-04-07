package br.com.zup.Zupnancas.models;

import br.com.zup.Zupnancas.enuns.StatusEnum;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "valor_contas")
    private Double valor;
    @Column(name = "descricao_contas")
    private String descricao;
    @Column(name = "entrada_contas")
    private LocalDate dataDeEntrada;
    @Column(name = "vencimento_contas")
    private LocalDate dataDeVencimento;
    @Column(name = "status_conta")
    private StatusEnum status;

    @ManyToOne(optional = false)
    private Saldo saldo;

    @ManyToMany
    private Categoria categoria;

    public Conta() {
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
}

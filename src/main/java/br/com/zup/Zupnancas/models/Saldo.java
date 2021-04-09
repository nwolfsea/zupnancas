package br.com.zup.Zupnancas.models;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;


@Entity
@Table(name = "saldos")
public class Saldo {
    @Id
    @CPF
    private String cpf;
    @Column(name = "valor_saldo")
    private Double valor;
    @Column(name = "limite_saldo")
    private Double limite;

    public Saldo() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}

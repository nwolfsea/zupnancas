package br.com.zup.Zupnancas.DTO;

import br.com.zup.Zupnancas.enuns.StatusEnum;

public class FIltroDeContasDTO {

    private StatusEnum status;

    public FIltroDeContasDTO() {
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}

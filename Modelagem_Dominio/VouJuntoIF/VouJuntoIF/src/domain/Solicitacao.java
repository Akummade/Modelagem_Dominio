package domain;

import java.time.LocalDate;

public class Solicitacao {
    
    private LocalDate dataSolicitacao;
    private Situacao situacao;
    private Passageiro passageiros;

    public Solicitacao(LocalDate dataSolicitacao, Situacao situacao, Passageiro passageiros) {
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
        this.passageiros = passageiros;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }
    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    public Passageiro getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(Passageiro passageiros) {
        this.passageiros = passageiros;
    }

    @Override

    public String toString() {
        return "Solicitacao [dataSolicitacao=" + dataSolicitacao + ", situacao=" + situacao + ", passageiros="
                + passageiros + "]";
    }
    
}

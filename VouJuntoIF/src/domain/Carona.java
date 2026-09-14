package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carona {
    private Integer id;
    private Motorista motorista;
    private Veiculo carro;
    private String localSaida;
    private String localDestino;
    private LocalDate data;
    private LocalTime hora;
    private Situacao situacao;

    private List<Solicitacao> solicitacoes;

    public Carona(Integer id, Motorista motorista, Veiculo carro, String localSaida, String localDestino, LocalDate data, LocalTime hora,
            Situacao situacao) {
        this.id = id;
        this.motorista = motorista;
        this.carro = carro;
        this.localSaida = localSaida;   
        this.localDestino = localDestino;
        this.data = data;
        this.hora = hora;
        this.situacao = situacao;
        this.solicitacoes = new ArrayList<>();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getCarro() {
        return carro;
    }
    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }
    public String getLocalSaida() {
        return localSaida;
    }
    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }
    public String getLocalDestino() {
        return localDestino;
    }
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }
    public void adicionarSolicitacao(Solicitacao solicitacao) {
        this.solicitacoes.add(solicitacao);
    }

    @Override
    public String toString() {
        return "Carona [carro=" + carro + ", localSaida=" + localSaida + ", localDestino=" + localDestino + ", data="
                + data + ", hora=" + hora + ", situacao=" + situacao + "]";
    }

    
}
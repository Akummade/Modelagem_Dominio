package domain;

import java.time.LocalDate;

public class Partida {
    private Integer id;
    
    private Equipe equipe1;
    private Equipe equipe2;
    
    private LocalDate dataPartida;
    private String pontuacao;
    private EstadoPartida estadoPartida;
    private Campeonato campeonatoPartida;

    

    public Partida(Integer id, Equipe equipe1, Equipe equipe2, LocalDate dataPartida, String pontuacao,
            EstadoPartida estadoPartida, Campeonato campeonatoPartida) {
        this.id = id;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.dataPartida = dataPartida;
        this.pontuacao = pontuacao;
        this.estadoPartida = estadoPartida;
        this.campeonatoPartida = campeonatoPartida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public EstadoPartida getEstadoPartida() {
        return estadoPartida;
    }

    public void setEstadoPartida(EstadoPartida estadoPartida) {
        this.estadoPartida = estadoPartida;
    }

    public Campeonato getCampeonatoPartida() {
        return campeonatoPartida;
    }

    public void setCampeonatoPartida(Campeonato campeonatoPartida) {
        this.campeonatoPartida = campeonatoPartida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partida{");
        sb.append("id=").append(id);
        sb.append(", equipe1=").append(equipe1);
        sb.append(", equipe2=").append(equipe2);
        sb.append(", dataPartida=").append(dataPartida);
        sb.append(", pontuacao=").append(pontuacao);
        sb.append(", estadoPartida=").append(estadoPartida);
        sb.append(", campeonatoPartida=").append(campeonatoPartida);
        sb.append('}');
        return sb.toString();
    }

    

}

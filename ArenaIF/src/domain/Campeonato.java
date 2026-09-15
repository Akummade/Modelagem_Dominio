package domain;

import java.time.LocalDate;
import java.util.List;

public class Campeonato {
    private Integer id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Integer quantidadeMax;
    private EstadoCampeonato estadoCampeonato;
    private FormaCompeticao formaCompeticao;
    
    private List<Jogador> jogadoresIndividuais;
    private List<Equipe>  equipesParticipantes;
    private List<Partida> partidas;

    public Campeonato(Integer id, String nome, LocalDate dataInicio, LocalDate dataTermino, Integer quantidadeMax,
            EstadoCampeonato estadoCampeonato, FormaCompeticao formaCompeticao) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.quantidadeMax = quantidadeMax;
        this.estadoCampeonato = estadoCampeonato;
        this.formaCompeticao = formaCompeticao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Integer getQuantidadeMax() {
        return quantidadeMax;
    }

    public void setQuantidadeMax(Integer quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    public EstadoCampeonato getEstadoCampeonato() {
        return estadoCampeonato;
    }

    public void setEstadoCampeonato(EstadoCampeonato estadoCampeonato) {
        this.estadoCampeonato = estadoCampeonato;
    }

    public FormaCompeticao getFormaCompeticao() {
        return formaCompeticao;
    }

    public void setFormaCompeticao(FormaCompeticao formaCompeticao) {
        this.formaCompeticao = formaCompeticao;
    }

    public List<Jogador> getJogadoresIndividuais() {
        return jogadoresIndividuais;
    }

    public void setJogadoresIndividuais(List<Jogador> jogadoresIndividuais) {
        this.jogadoresIndividuais = jogadoresIndividuais;
    }

    public List<Equipe> getEquipesParticipantes() {
        return equipesParticipantes;
    }

    public void setEquipesParticipantes(List<Equipe> equipesParticipantes) {
        this.equipesParticipantes = equipesParticipantes;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campeonato{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataTermino=").append(dataTermino);
        sb.append(", quantidadeMax=").append(quantidadeMax);
        sb.append(", estadoCampeonato=").append(estadoCampeonato);
        sb.append(", formaCompeticao=").append(formaCompeticao);
        sb.append(", jogadoresIndividuais=").append(jogadoresIndividuais);
        sb.append(", equipesParticipantes=").append(equipesParticipantes);
        sb.append(", partidas=").append(partidas);
        sb.append('}');
        return sb.toString();
    }

    
}

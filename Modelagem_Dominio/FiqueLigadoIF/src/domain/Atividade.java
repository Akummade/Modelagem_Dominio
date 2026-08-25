package domain;

import java.time.LocalDateTime;
import java.util.List;

public class Atividade {
    private Integer id;
    private String titulo;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Double cargaHoraria;
    private Integer quantidadeVagas;
    private Evento evento;
    private Local local;

    private List<AreaDaAtividade> areas;

    private List<Inscricao> inscritos;

    private List<AtividadeMinistrante> ministrantes;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }
    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }
    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }
    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
    public Double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Integer getQuantidadeVagas() {
        return quantidadeVagas;
    }
    public void setQuantidadeVagas(Integer quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public Atividade(Integer id, String titulo, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
            Double cargaHoraria, Integer quantidadeVagas, Evento evento, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeVagas = quantidadeVagas;
        this.evento = evento;
        this.local = local;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Atividade{");
        sb.append("id=").append(id);
        sb.append(", titulo=").append(titulo);
        sb.append(", dataHoraInicio=").append(dataHoraInicio);
        sb.append(", dataHoraFim=").append(dataHoraFim);
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append(", quantidadeVagas=").append(quantidadeVagas);
        sb.append(", evento=").append(evento);
        sb.append(", local=").append(local);
        sb.append('}');
        return sb.toString();
    }
    
}

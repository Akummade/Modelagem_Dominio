package domain;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Agendamento {
    private Integer id;
    private Quadra quadra;
    private Modalidade modalidade;
    private LocalDateTime dataHoraInicio;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private SituacaoAgendamento situacao;

    private List <Aluno> alunos;

    public Agendamento(Integer id, Quadra quadra, Modalidade modalidade, LocalDateTime dataHoraInicio,
            LocalTime horaInicio, LocalTime horaFim, SituacaoAgendamento situacao) {
        this.id = id;
        this.quadra = quadra;
        this.modalidade = modalidade;
        this.dataHoraInicio = dataHoraInicio;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public SituacaoAgendamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAgendamento situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agendamento{");
        sb.append("id=").append(id);
        sb.append(", quadra=").append(quadra);
        sb.append(", modalidade=").append(modalidade);
        sb.append(", dataHoraInicio=").append(dataHoraInicio);
        sb.append(", horaInicio=").append(horaInicio);
        sb.append(", horaFim=").append(horaFim);
        sb.append(", situacao=").append(situacao);
        sb.append('}');
        return sb.toString();
    }


    
}

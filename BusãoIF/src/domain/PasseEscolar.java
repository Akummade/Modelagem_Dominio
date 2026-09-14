package domain;

import java.time.LocalDate;

public class PasseEscolar {
    private Integer id;
    private String numeroPasse;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private EstadoPasse situacaoPasse;
    private Solicitacao solicitacao;
    
    public PasseEscolar(Integer id, String numeroPasse, LocalDate dataEmissao, LocalDate dataValidade,
            EstadoPasse situacaoPasse, Solicitacao solicitacao) {
        this.id = id;
        this.numeroPasse = numeroPasse;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.situacaoPasse = situacaoPasse;
        this.solicitacao = solicitacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPasse() {
        return numeroPasse;
    }

    public void setNumeroPasse(String numeroPasse) {
        this.numeroPasse = numeroPasse;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public EstadoPasse getSituacaoPasse() {
        return situacaoPasse;
    }

    public void setSituacaoPasse(EstadoPasse situacaoPasse) {
        this.situacaoPasse = situacaoPasse;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PasseEscolar{");
        sb.append("id=").append(id);
        sb.append(", numeroPasse=").append(numeroPasse);
        sb.append(", dataEmissao=").append(dataEmissao);
        sb.append(", dataValidade=").append(dataValidade);
        sb.append(", situacaoPasse=").append(situacaoPasse);
        sb.append(", solicitacao=").append(solicitacao);
        sb.append('}');
        return sb.toString();
    }

    
}

package domain;

import java.util.List;

public class Solicitacao {
    private Integer id;
    private LinhaOnibus linhaOnibus;
    private Estudante estudante;
    private Integer numeroRg;
    private EstadoSolicitacao estadoSolicitacao;
    
    private List<Documento> documentos;

    public Solicitacao(Integer id, LinhaOnibus linhaOnibus, Estudante estudante, Integer numeroRg,
            EstadoSolicitacao estadoSolicitacao) {
        this.id = id;
        this.linhaOnibus = linhaOnibus;
        this.estudante = estudante;
        this.numeroRg = numeroRg;
        this.estadoSolicitacao = estadoSolicitacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LinhaOnibus getLinhaOnibus() {
        return linhaOnibus;
    }

    public void setLinhaOnibus(LinhaOnibus linhaOnibus) {
        this.linhaOnibus = linhaOnibus;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Integer getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(Integer numeroRg) {
        this.numeroRg = numeroRg;
    }

    public EstadoSolicitacao getEstadoSolicitacao() {
        return estadoSolicitacao;
    }

    public void setEstadoSolicitacao(EstadoSolicitacao estadoSolicitacao) {
        this.estadoSolicitacao = estadoSolicitacao;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Solicitacao{");
        sb.append("id=").append(id);
        sb.append(", linhaOnibus=").append(linhaOnibus);
        sb.append(", estudante=").append(estudante);
        sb.append(", numeroRg=").append(numeroRg);
        sb.append(", estadoSolicitacao=").append(estadoSolicitacao);
        sb.append(", documentos=").append(documentos);
        sb.append('}');
        return sb.toString();
    }
    
    
}

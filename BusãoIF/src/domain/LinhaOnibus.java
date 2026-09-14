package domain;

public class LinhaOnibus {
    private Integer id;
    private Integer numeroLinha;
    private String nomeLinha;
    private Empresa empresaResponsavel;
    private String pontoDePartida;
    private String pontoDeChegada;

    public LinhaOnibus(Integer id, Integer numeroLinha, String nomeLinha, Empresa empresaResponsavel,
            String pontoDePartida, String pontoDeChegada) {
        this.id = id;
        this.numeroLinha = numeroLinha;
        this.nomeLinha = nomeLinha;
        this.empresaResponsavel = empresaResponsavel;
        this.pontoDePartida = pontoDePartida;
        this.pontoDeChegada = pontoDeChegada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(Integer numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public Empresa getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public void setEmpresaResponsavel(Empresa empresaResponsavel) {
        this.empresaResponsavel = empresaResponsavel;
    }

    public String getPontoDePartida() {
        return pontoDePartida;
    }

    public void setPontoDePartida(String pontoDePartida) {
        this.pontoDePartida = pontoDePartida;
    }

    public String getPontoDeChegada() {
        return pontoDeChegada;
    }

    public void setPontoDeChegada(String pontoDeChegada) {
        this.pontoDeChegada = pontoDeChegada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinhaOnibus{");
        sb.append("id=").append(id);
        sb.append(", numeroLinha=").append(numeroLinha);
        sb.append(", nomeLinha=").append(nomeLinha);
        sb.append(", empresaResponsavel=").append(empresaResponsavel);
        sb.append(", pontoDePartida=").append(pontoDePartida);
        sb.append(", pontoDeChegada=").append(pontoDeChegada);
        sb.append('}');
        return sb.toString();
    }

    
}

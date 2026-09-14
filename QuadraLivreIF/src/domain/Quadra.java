package domain;

import java.util.List;

public class Quadra {
    private Integer id;
    private String nome;
    private String localizacao;
    private Piso tipoPiso;
    private List<Modalidade> modalidade;

    
    public Quadra(Integer id, String nome, String localizacao, Piso tipoPiso) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoPiso = tipoPiso;
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


    public String getLocalizacao() {
        return localizacao;
    }


    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public Piso getTipoPiso() {
        return tipoPiso;
    }


    public void setTipoPiso(Piso tipoPiso) {
        this.tipoPiso = tipoPiso;
    }



    @Override
    public String toString() {
        return "Quadra [id=" + id + ", nome=" + nome + ", localizacao=" + localizacao + ", tipoPiso=" + tipoPiso
                +  "]";
    }

}

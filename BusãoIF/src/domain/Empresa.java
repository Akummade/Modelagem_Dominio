package domain;

import java.util.List;

public class Empresa {
    private Integer id;
    private String nome;
    private String cnpj;
    private Endereco endereco;

    private List<LinhaOnibus> linhasOnibus;

    public Empresa(Integer id, String nome, String cnpj, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<LinhaOnibus> getLinhasOnibus() {
        return linhasOnibus;
    }

    public void setLinhasOnibus(List<LinhaOnibus> linhasOnibus) {
        this.linhasOnibus = linhasOnibus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", cnpj=").append(cnpj);
        sb.append(", endereco=").append(endereco);
        sb.append(", linhasOnibus=").append(linhasOnibus);
        sb.append('}');
        return sb.toString();
    }

    
}

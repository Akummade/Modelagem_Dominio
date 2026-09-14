package domain;

public class Endereco {
    private Integer id;
    private Integer cep;
    private Integer numero;
    private String logradouro;
    private String bairro;
    private String cidade;
    
    public Endereco(Integer id, Integer cep, Integer numero, String logradouro, String bairro, String cidade) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", cep=" + cep + ", numero=" + numero + ", logradouro=" + logradouro + ", bairro="
                + bairro + ", cidade=" + cidade + "]";
    }
    
    
}

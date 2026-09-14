package domain;

import java.util.List;

public class Motorista {
    private Integer id;
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private List<Veiculo> veiculos;

    public Motorista(Integer id, Integer cpf, String nome, Integer telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;

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

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorista{");
        sb.append("nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", telefone=").append(telefone);
        sb.append(", veiculos=").append(veiculos);
        sb.append('}');
        return sb.toString();
    }

    
}

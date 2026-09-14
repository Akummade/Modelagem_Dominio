package domain;

public class Passageiro {
    private String nome;
    private Integer cpf;
    private Integer telefone;

    public Passageiro(String nome, Integer cpf, Integer telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Passageiro{");
        sb.append("nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", telefone=").append(telefone);
        sb.append('}');
        return sb.toString();
    }

    
}

package domain;

public class Aluno {
    private Integer id;
    private String nome;
    private Integer matricula;
    private Integer cpf;
    private String telefone;
    
    public Aluno(Integer id, String nome, Integer matricula, Integer cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf + ", telefone="
                + telefone + "]";
    }

    
}

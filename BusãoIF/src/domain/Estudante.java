package domain;

public class Estudante {
    private Integer id;
    private String nome;
    private Integer cpf;
    private Integer matricula;
    private String curso;
    private Endereco endereco;
    private String turno;
    
    public Estudante(Integer id, String nome, Integer cpf, Integer matricula, String curso, Endereco endereco,
            String turno) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.endereco = endereco;
        this.turno = turno;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudante{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", matricula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append(", endereco=").append(endereco);
        sb.append(", turno=").append(turno);
        sb.append('}');
        return sb.toString();
    }

    
}

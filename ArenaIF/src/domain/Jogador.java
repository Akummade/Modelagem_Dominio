package domain;

public class Jogador {
    private Integer id;
    private String nome;
    private String curso;
    private Integer anoEscolar;
    private Equipe equipeAluno;

    public Jogador(Integer id, String nome, String curso, Integer anoEscolar, Equipe equipeAluno) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.anoEscolar = anoEscolar;
        this.equipeAluno = equipeAluno;
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
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Integer getAnoEscolar() {
        return anoEscolar;
    }
    public void setAnoEscolar(Integer anoEscolar) {
        this.anoEscolar = anoEscolar;
    }
    public Equipe getEquipeAluno() {
        return equipeAluno;
    }
    public void setEquipeAluno(Equipe equipeAluno) {
        this.equipeAluno = equipeAluno;
    }

    @Override
    public String toString() {
        return "Jogador [id=" + id + ", nome=" + nome + ", curso=" + curso + ", anoEscolar=" + anoEscolar
                + ", equipeAluno=" + equipeAluno + "]";
    }

    
}

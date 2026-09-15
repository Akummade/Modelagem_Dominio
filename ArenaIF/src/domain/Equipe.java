package domain;

import java.util.List;

public class Equipe {
    private Integer id;
    private String nome;
    private String nomeCapitão;

    private List <Jogador> jogadores;

    public Equipe(Integer id, String nome, String nomeCapitão) {
        this.id = id;
        this.nome = nome;
        this.nomeCapitão = nomeCapitão;
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

    public String getCapitão() {
        return nomeCapitão;
    }

    public void setCapitão(String capitão) {
        this.nomeCapitão = capitão;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipe{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", capit\u00e3o=").append(nomeCapitão);
        sb.append(", jogadores=").append(jogadores);
        sb.append('}');
        return sb.toString();
    }

    
}

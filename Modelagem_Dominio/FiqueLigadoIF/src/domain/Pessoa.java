package domain;

import java.util.List;

public class Pessoa {
    private Integer id;
    private String nome;
    private String link_foto;
    private String biografia;
    private String email;

    private List<AtividadeMinistrante> atividadeMinistradas;
    
    public Pessoa(Integer id, String nome, String link_foto, String biografia, String email) {
        this.id = id;
        this.nome = nome;
        this.link_foto = link_foto;
        this.biografia = biografia;
        this.email = email;
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

    public String getLink_foto() {
        return link_foto;
    }

    public void setLink_foto(String link_foto) {
        this.link_foto = link_foto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", link_foto=").append(link_foto);
        sb.append(", biografia=").append(biografia);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
}

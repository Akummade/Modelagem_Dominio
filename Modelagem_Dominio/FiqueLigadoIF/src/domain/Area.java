package domain;

import java.util.List;

public class Area {
    private Integer id;
    private String nome;

    private List<AreaDaAtividade> atividadesOfertadas;

    public Area(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Area{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append('}');
        return sb.toString();
    }
    
    
}

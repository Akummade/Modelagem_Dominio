package domain;

public class Veiculo {
    private Integer id;
    private String placa;
    private String modelo;
    private String cor;
    private Integer quantidadePassageiros;
    
    public Veiculo(Integer id, String placa, String modelo, String cor, Integer quantidadePassageiros) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(Integer quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + ", quantidadePassageiros="
                + quantidadePassageiros + "]";
    }

    
}

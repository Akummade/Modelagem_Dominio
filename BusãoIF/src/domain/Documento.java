package domain;

import java.time.LocalDate;

public class Documento {
    private Integer id;
    private String nome;
    private LocalDate dataEnvio;
    private EstadoDocumento estadoDocumento;
    
    public Documento(Integer id, String nome, LocalDate dataEnvio, EstadoDocumento estadoDocumento) {
        this.id = id;
        this.nome = nome;
        this.dataEnvio = dataEnvio;
        this.estadoDocumento = estadoDocumento;
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

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public EstadoDocumento getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(EstadoDocumento estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    @Override
    public String toString() {
        return "Documento [id=" + id + ", nome=" + nome + ", dataEnvio=" + dataEnvio + ", estadoDocumento="
                + estadoDocumento + "]";
    }
    
    
}

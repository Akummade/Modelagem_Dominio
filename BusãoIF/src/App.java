

import domain.*;
public class App {

    public static void main(String[] args) {

        // Endereço da empresa
        Endereco enderecoEmpresa = new Endereco(1, 38400000, 100, "Av. Brasil", "Centro", "Araguari");

        // Empresa responsável pela linha
        Empresa empresa = new Empresa(1, "Viação Araguari", "12.345.678/0001-90", enderecoEmpresa);

        // Linha de ônibus
        LinhaOnibus linha = new LinhaOnibus(1, 101, "Centro - Universidade", empresa, "Centro", "Universidade");

        // Endereço do estudante
        Endereco enderecoEstudante = new Endereco(2, 38400123, 45, "Rua das Flores", "Jardim América", "Araguari");

        // Estudante
        Estudante estudante = new Estudante(1, "João da Silva", 123456789, 202301, "Ciência da Computação",
                enderecoEstudante, "Noturno");

        // Solicitação de passe escolar
        Solicitacao solicitacao = new Solicitacao(1, linha, estudante, 987654321, EstadoSolicitacao.INICIADA);

        // Impressão dos objetos criados
        System.out.println("=== Empresa ===");
        System.out.println(empresa);

        System.out.println("\n=== Linha de Ônibus ===");
        System.out.println(linha);

        System.out.println("\n=== Estudante ===");
        System.out.println(estudante);

        System.out.println("\n=== Solicitação ===");
        System.out.println(solicitacao);
    }
}
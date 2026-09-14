import domain.Carona;
import domain.Motorista;
import domain.Passageiro;
import domain.Situacao;
import domain.Solicitacao;
import domain.Veiculo;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {

        Veiculo veiculo = new Veiculo("ABC1D23", "Fiat Uno", "Prata", 4);
        Motorista motorista = new Motorista(123456789, "João Silva", 999998888);

        Carona carona = new Carona(
                motorista,
                veiculo,
                "Centro",
                "Bairro Industrial",
                LocalDate.of(2026, 9, 20),
                LocalTime.of(8, 0),
                Situacao.PENDENTE
        );

        Passageiro passageiro1 = new Passageiro("Maria Souza", 111222333, 988887777);
        Passageiro passageiro2 = new Passageiro("Carlos Lima", 222333444, 977776666);
        Passageiro passageiro3 = new Passageiro("Ana Pereira", 333444555, 966665555);

        Solicitacao solicitacao1 = new Solicitacao(LocalDate.of(2026, 9, 15), Situacao.PENDENTE, passageiro1);
        Solicitacao solicitacao2 = new Solicitacao(LocalDate.of(2026, 9, 16), Situacao.PENDENTE, passageiro2);
        Solicitacao solicitacao3 = new Solicitacao(LocalDate.of(2026, 9, 17), Situacao.PENDENTE, passageiro3);

        carona.adicionarSolicitacao(solicitacao1);
        carona.adicionarSolicitacao(solicitacao2);
        carona.adicionarSolicitacao(solicitacao3);

        System.out.println("Motorista: " + motorista);
        System.out.println("Carona: " + carona);
        System.out.println("\nSolicitações registradas:");
        for (Solicitacao s : carona.getSolicitacoes()) {
            System.out.println(" - " + s);
        }
    }
}
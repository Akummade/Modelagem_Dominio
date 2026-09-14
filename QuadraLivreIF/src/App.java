import domain.Agendamento;
import domain.Modalidade;
import domain.Piso;
import domain.Quadra;
import domain.SituacaoAgendamento;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Quadra quadra1 = new Quadra(1, "Quadra Poliesportiva", "Bloco A", Piso.CIMENTO);
      

        Quadra quadra2 = new Quadra(2, "Quadra de Vôlei", "Bloco B", Piso.MADEIRA);

        Agendamento agendamento1 = new Agendamento(
                1,
                quadra1,
                Modalidade.FUTEBOL,
                LocalDateTime.of(2026, 9, 15, 14, 0),
                LocalTime.of(14, 0),
                LocalTime.of(15, 0),
                SituacaoAgendamento.SOLICITADO
        );


        Agendamento agendamento2 = new Agendamento(
                2,
                quadra1,
                Modalidade.HANDEBOL,
                LocalDateTime.of(2026, 9, 16, 16, 0),
                LocalTime.of(16, 0),
                LocalTime.of(17, 0),
                SituacaoAgendamento.APROVADO
        );


        Agendamento agendamento3 = new Agendamento(
                3,
                quadra2,
                Modalidade.VOLEI,
                LocalDateTime.of(2026, 9, 17, 9, 0),
                LocalTime.of(9, 0),
                LocalTime.of(10, 0),
                SituacaoAgendamento.CONFIRMADO
        );


        Agendamento agendamento4 = new Agendamento(
                4,
                quadra2,
                Modalidade.BASQUETE,
                LocalDateTime.of(2026, 9, 18, 18, 0),
                LocalTime.of(18, 0),
                LocalTime.of(19, 0),
                SituacaoAgendamento.CANCELADO
        );



        ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();
        agendamentos.add(agendamento1);
        agendamentos.add(agendamento2);
        agendamentos.add(agendamento3);
        agendamentos.add(agendamento4);
        
        System.out.println("Quadras cadastradas:");
        System.out.println(" - " + quadra1);
        System.out.println(" - " + quadra2);

        System.out.println("\nAgendamentos:");
        for (Agendamento a : agendamentos) {
            System.out.println(" - Quadra: " + a.getQuadra().getNome()
                    + " | Modalidade: " + a.getModalidade()
                    + " | Data/Hora: " + a.getDataHoraInicio()
                    + " | Horario: " + a.getHoraInicio() + " as " + a.getHoraFim()
                    + " | Situacao: " + a.getSituacao()
            );
        }
    }
}
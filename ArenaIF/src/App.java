
import domain.*;
import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        /* private Integer id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Integer quantidadeMax;
    private EstadoCampeonato estadoCampeonato;
    private FormaCompeticao formaCompeticao;
     */

        Campeonato campeonato = new Campeonato(1 , "Copa_Pistao" , 
            LocalDate.of(2027 , 10 , 22) , 
            LocalDate.of(2027 , 10 , 29) , 
            30,
            EstadoCampeonato.INSCRICOES_ABERTAS,
            FormaCompeticao.ELIMINATORIA
        );

        Equipe equipe1 = new Equipe(1, "BarSemLona", "Carlos_Miguel");

        Jogador jogador1 = new Jogador(
            1 , 
            "Carlos_Miguel" , 
            "DS" , 
            2, 
            equipe1
        );

        Jogador jogador2 = new Jogador(
            2 , 
            "Eduardo_Enrique" , 
            "DS" , 
            2, 
            equipe1
        );

        Jogador jogador3 = new Jogador(
            3 , 
            "Jose_Duarte" , 
            "DS" , 
            2, 
            equipe1
        );

        Equipe equipe2 = new Equipe(1, "RealMadruga", "Eliote_Peixoto");

        Jogador jogador4 = new Jogador(
            4 , 
            "Eliote_Peixoto" , 
            "COM" , 
            2, 
            equipe2
        );

        Jogador jogador5 = new Jogador(
            5 , 
            "Marcelo_Cabral" , 
            "COM" , 
            2, 
            equipe2
        );

        Jogador jogador6 = new Jogador(
            6 , 
            "Daniel_Brito" , 
            "PJD" , 
            2, 
            equipe2
        );

        List <Jogador> jogadoresLista1 = Arrays.asList(jogador1,jogador2,jogador3);
        equipe1.setJogadores(jogadoresLista1);

        List <Jogador> jogadoresLista2 = Arrays.asList(jogador4,jogador5,jogador6);
        equipe1.setJogadores(jogadoresLista2);

        Partida partidaAbertura = new Partida(
            1, 
            equipe1 , 
            equipe2 , 
            LocalDate.of(2027 , 10 , 22) , 
            "10_0" , 
            EstadoPartida.AGENDADA , 
            campeonato 
        );

        IO.println(partidaAbertura);
    }
}

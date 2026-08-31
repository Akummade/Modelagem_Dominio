
import domain.Evento;
import domain.EventoEnum;
import domain.Pessoa;
import domain.TipoUsuarioEnum;
import domain.Usuario;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws Exception {

        AreaDaAtividade areaDaAtividade = new AreaDaAtividade(1, area, atividade);
        AtividadeMinistrante ministrante = new AtividadeMinistrante(1, atividade, pessoa);
        Inscricao inscricao = new Inscricao(1,
                LocalDateTime.of(2026, 7, 24, 11, 25, 22),
                atividade,
                usuario);
        
        System.out.println(areaDaAtividade);
        System.out.println(ministrante);
        System.out.println(inscricao);
        
    }
}

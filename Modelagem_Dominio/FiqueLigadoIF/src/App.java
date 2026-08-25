
import domain.Evento;
import domain.EventoEnum;
import domain.Pessoa;
import domain.TipoUsuarioEnum;
import domain.Usuario;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa(
                1,
                "João Silva",
                "https://exemplo.com/foto.jpg",
                "Eu Desenvolvo sistemas , fiz IFTM no curso de PJ :)) ... pena que tenho dificuldade de arrajar emprego e vivo comendo miojo no meu apartamento triste e acabado de 2 m² :)))))))))",
                "joaoSL.DEVSEN@email.com"
        );
        Pessoa pessoa2 = new Pessoa(
                2,
                "Jorge Amado",
                "https://exemplo.com/foto.jpg",
                "Desenvolvedor de software que ama tecnologia.",
                "gmail.jorge@gmail.com"
        );

        Usuario user = new Usuario(12311, "2d01fb103a23b90412f4cc028cc4bdbbd04c2a41", TipoUsuarioEnum.ALUNO, pessoa);
        Usuario user2 = new Usuario(1211, "2d01f103a239f4cc028cbd04c2a41", TipoUsuarioEnum.ALUNO, pessoa2);

        Evento evento = new Evento(
                1,
                "Workshop de Java",
                LocalDate.of(2026, 9, 10),
                LocalDate.of(2026, 9, 12),
                "https://exemplo.com/banner-java.png",
                EventoEnum.APROVADO,
                150.00,
                user,
                user2
        );

        //System.out.println("User --> " + user.getId() + " -- " + user.getSenha() + " -- " + user.getPessoa());
        System.out.println(evento.getId() + " -- " + evento.getNome() + " -- " + evento.getCadastradoPor() + " -- " + evento.getResponsavel());

    }
}

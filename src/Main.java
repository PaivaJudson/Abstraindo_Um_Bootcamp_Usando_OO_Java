import judson.paiva.desafio.dominio.Curso;
import judson.paiva.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Engenharia Informática", "EINF é a sigla no ISPTEC", 1200);
        Curso curso2 = new Curso("Engenharia de Produção Industrial", "EPI é a sigla no ISPTEC", 1200);


        Mentoria mentoria1 = new Mentoria("Git e Github", "Aprenda a usar o Git e o Github", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Flutter", "Aprenda a tecnologia Flutter", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);

    }

}

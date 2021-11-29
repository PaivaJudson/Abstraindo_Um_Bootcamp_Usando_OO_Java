import judson.paiva.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Engenharia Informática", "EINF é a sigla no ISPTEC", 1200);
        Curso curso2 = new Curso("Engenharia de Produção Industrial", "EPI é a sigla no ISPTEC", 1200);


        Mentoria mentoria1 = new Mentoria("Git e Github", "Aprenda a usar o Git e o Github", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Flutter", "Aprenda a tecnologia Flutter", LocalDate.now());

        Conteudo conteudo1 = new Curso("Introdução a Engenharia","", 40);
        Conteudo conteudo2 = new Mentoria("Flutter", "Aprenda a tecnologia Flutter", LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);


        Dev devJudson = new Dev();
        devJudson.setNome("Judson Paiva");
        devJudson.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos: "+devJudson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devJudson.getGetConteudosConcluidos());


        devJudson.progredir();
        devJudson.progredir();

        System.out.println("Conteúdos Inscritos: "+devJudson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devJudson.getGetConteudosConcluidos());

        System.out.println("--------------------");

        Dev devCamilaJoao = new Dev();
        devCamilaJoao.setNome("Camila João");
        devCamilaJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos: "+devCamilaJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devCamilaJoao.getGetConteudosConcluidos());

        devCamilaJoao.progredir();

        System.out.println("Conteúdos Inscritos: "+devCamilaJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+devCamilaJoao.getGetConteudosConcluidos());


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(conteudo1 +" tem como preço = "+conteudo1.calacularXP());
        System.out.println(conteudo2);
        */
    }

}

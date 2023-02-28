import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Orange Tech Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Orange Tech Javascript");
        curso2.setDescricao("Curso de Javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Orange Tech Java");
        mentoria.setDescricao("Descrição Full Stack");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElton = new Dev();
        devElton.setNome("Elton");
        devElton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devElton.getNome() + ": " + devElton.getConteudosInscritos());
        devElton.progredir();
        devElton.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devElton.getNome() + ": " + devElton.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devElton.getNome() + ": " + devElton.getConteudosConcluidos());
        System.out.println("XP: " + devElton.calcTotalXp());

        System.out.println("-----------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos " + devCarlos.getNome() + ": " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos " + devCarlos.getNome() + ": " + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devCarlos.getNome() + ": " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcTotalXp());
    }
}
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("-------");

        Dev devMarley = new Dev();
        devMarley.setNome("Marley");
        devMarley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devMarley.getConteudosInscritos());
        devMarley.progredir();
        devMarley.progredir();
        devMarley.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devMarley.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devMarley.getConteudosConcluidos());
        System.out.println("XP:" + devMarley.calcularTotalXp());

    }

}

package br.com.dio.desafio;

import br.com.dio.desafio.entidades.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java Orientado a objetos.");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Curso curso = new Curso();
        curso.setTitulo("Java OO");
        curso.setDescricao("Curso sobre orientação a objetos");
        curso.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Spring Boot");
        curso2.setDescricao("Curso de desenvolvimento de APIs com Spring Boot");
        curso2.setCargaHoraria(9);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp java developer da empresa DIO");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinícius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("XP: " + devVinicius.calcularTotalXp());

        Dev devCamila = new Dev();
        devVinicius.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        System.out.println("XP camila: " + devCamila.calcularTotalXp());



    }
}
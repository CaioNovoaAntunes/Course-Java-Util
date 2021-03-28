package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        
        System.out.println(javaColecoes);
        
        
        
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");  
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        alunos.add("Caio");
        boolean adicionou = alunos.add("Caio");
        System.out.println(adicionou);
        alunos.add("luiz");
        System.out.println(alunos);
        alunos.add("Caio");
        System.out.println();
        System.out.println();
        System.out.println(alunos.size());
        
        
    }
}
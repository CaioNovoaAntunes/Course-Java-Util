package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Perfomance {
    public static void main(String[] args) {
		Collection<Integer> numeros = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();
	
		for(int i = 1; i < 100000; i ++) {
			numeros.add(i);
			
		
		}
		for(Integer numero:numeros) {
			numeros.contains(numero);
			
		}
		long fim = System.currentTimeMillis();
		
		long tempoDeExecução = fim - inicio;    
		
	System.out.println("Tempo gasto =  " + tempoDeExecução);
    }
    
}

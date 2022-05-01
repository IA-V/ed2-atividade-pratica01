package main;
import armazenamento.*;
import ordenacao.*;

public class Main {
	public static void main (String [] args) {
		Estrutura<String, Integer>[] vetor = new Estrutura[5];
		Estrutura<String, Integer>[] vetorOrdenado = new Estrutura[5];
		vetor[0] = new Estrutura<String, Integer>("c", 3);
		vetor[1] = new Estrutura<String, Integer>("a", 1);
		vetor[2] = new Estrutura<String, Integer>("c", 2);
		vetor[3] = new Estrutura<String, Integer>("e", 5);
		vetor[4] = new Estrutura<String, Integer>("d", 4);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
		System.out.println("---------------------------------\n---------------------------------\n");
		
		SelectionSort.ordenar(vetor);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
	}
}

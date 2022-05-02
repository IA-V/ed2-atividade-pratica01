package main;
import armazenamento.*;
import ordenacao.*;

public class Main {
	public static void main (String [] args) {
		Estrutura<Integer, String>[] vetor = new Estrutura[5];
		vetor[0] = new Estrutura<>(3, "cafe");
		vetor[1] = new Estrutura<>(1, "agua");
		vetor[2] = new Estrutura<>(3, "colchao");
		vetor[3] = new Estrutura<>(5, "espada");
		vetor[4] = new Estrutura<>(4, "duelo");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
		System.out.println("---------------------------------\n---------------------------------\n");
		
		SelectionSort.ordenar(vetor); // Talvez, para valores muito pequenos, o selectionsort seja estavel
		//InsertionSort.ordenar(vetor);
		//MergeSort.ordenar(vetor);
		//QuickSort.ordenar(vetor);
		//HeapSort.ordenar(vetor); // Talvez, para valores muito pequenos, o heapsort seja estavel
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
	}
}

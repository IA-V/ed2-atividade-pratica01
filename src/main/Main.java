package main;
import armazenamento.*;
import ordenacao.*;

public class Main {
	public static void main (String [] args) {
		Estrutura<Integer, String>[] vetor = new Estrutura[10];
		vetor[0] = new Estrutura<>(5, "cafe");
		vetor[1] = new Estrutura<>(2, "agua");
		vetor[2] = new Estrutura<>(4, "colchao");
		vetor[3] = new Estrutura<>(3, "espada");
		vetor[4] = new Estrutura<>(9, "duelo");
		vetor[5] = new Estrutura<>(6, "duelo");
		vetor[6] = new Estrutura<>(10, "duelo");
		vetor[7] = new Estrutura<>(8, "duelo");
		vetor[8] = new Estrutura<>(1, "duelo");
		vetor[9] = new Estrutura<>(7, "duelo");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
		System.out.println("---------------------------------\n---------------------------------\n");
		
		SelectionSort.ordenarMinMax(vetor); // Talvez, para valores muito pequenos, o selectionsort seja estavel
		//InsertionSort.ordenar(vetor);
		//MergeSort.ordenar(vetor);
		//QuickSort.ordenar(vetor);
		//HeapSort.ordenar(vetor); // Talvez, para valores muito pequenos, o heapsort seja estavel
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
	}
}

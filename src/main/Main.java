package main;
import armazenamento.*;
import ordenacao.*;

public class Main {
	public static void main (String [] args) {
		Estrutura<Integer, String>[] vetor = new Estrutura[20];
		vetor[0] = new Estrutura<>(16, "cafe");
		vetor[1] = new Estrutura<>(13, "agua");
		vetor[2] = new Estrutura<>(12, "colchao");
		vetor[3] = new Estrutura<>(18, "espada");
		vetor[4] = new Estrutura<>(15, "duelo");
		vetor[5] = new Estrutura<>(17, "duelo");
		vetor[6] = new Estrutura<>(11, "duelo");
		vetor[7] = new Estrutura<>(20, "duelo");
		vetor[8] = new Estrutura<>(14, "duelo");
		vetor[9] = new Estrutura<>(19, "duelo");
		vetor[10] = new Estrutura<>(3, "cafe");
		vetor[11] = new Estrutura<>(5, "agua");
		vetor[12] = new Estrutura<>(2, "colchao");
		vetor[13] = new Estrutura<>(10, "espada");
		vetor[14] = new Estrutura<>(9, "duelo");
		vetor[15] = new Estrutura<>(4, "duelo");
		vetor[16] = new Estrutura<>(6, "duelo");
		vetor[17] = new Estrutura<>(8, "duelo");
		vetor[18] = new Estrutura<>(1, "duelo");
		vetor[19] = new Estrutura<>(7, "duelo");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
		System.out.println("---------------------------------\n---------------------------------\n");
		
		//SelectionSort.ordenarMinMax(vetor); // Talvez, para valores muito pequenos, o selectionsort seja estavel
		//InsertionSort.ordenar(vetor);
		MergeSort.ordenarInsertion(vetor);
		//QuickSort.ordenar(vetor);
		//HeapSort.ordenar(vetor); // Talvez, para valores muito pequenos, o heapsort seja estavel
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
	}
}

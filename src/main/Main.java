package main;
import armazenamento.*;
import ordenacao.*;

public class Main {
	public static void main (String [] args) {		
		Estrutura[] vetor = new EstruturaChaveString[5];
		vetor[0] = new EstruturaChaveString<>("a", 12);
		vetor[1] = new EstruturaChaveString<>("d", 13);
		vetor[2] = new EstruturaChaveString<>("b", 126);
		vetor[3] = new EstruturaChaveString<>("e", 518);
		vetor[4] = new EstruturaChaveString<>("c", 10);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
		System.out.println("---------------------------------\n---------------------------------\n");
		
		//SelectionSort.ordenar(vetor); // Talvez, para valores muito pequenos, o selectionsort seja estavel
		//InsertionSort.ordenar(vetor);
		//MergeSort.ordenar(vetor);
		//QuickSort.ordenar(vetor);
		//HeapSort.ordenar(vetor); // Talvez, para valores muito pequenos, o heapsort seja estavel
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor = " + vetor[i].getValor() + "\nChave = " + vetor[i].getChave() + "\n");
		}
	}
}

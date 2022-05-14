package main;
import armazenamento.*;
import ordenacao.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
										// "i" é p tamanho da String
	private static String getRandomString(int i)  // Método para gerar strings aleatórias -> https://www.delftstack.com/pt/howto/java/random-alphanumeric-string-in-java/
    { 
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 

        return builder.toString(); 
    }
	
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		int opcaoOrdem = 0;
		int tamanhoVetor = 1000;	// Definição do tamanho do vetor
		Estrutura<String, Double>[] vetor = new Estrutura[tamanhoVetor]; // Definição do tipo de dado
		
		try {
			System.out.println("Ordenar em ordem crescente ou descrescente?\n1 - Crescente\t2 - Decrescente");
			opcaoOrdem = entrada.nextInt();
			Random gerador = new Random();
			
			for(int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = new Estrutura<>(getRandomString(15), gerador.nextDouble(tamanhoVetor), Ordem.values()[opcaoOrdem-1]); // Inicialização do vetor
			}
			
			/*System.out.println("Vetor desordenado:");
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("[" + vetor[i].getChave() + ", " + vetor[i].getValor() + "]");
			}
			System.out.println("---------------------------------\n---------------------------------\n");*/
			double startTime = System.nanoTime();
			
			//SelectionSort.ordenar(vetor); // Talvez, para valores muito pequenos, o selectionsort seja estavel
			SelectionSort.ordenarMinMax(vetor);
			//InsertionSort.ordenar(vetor); // Fiz o insertion por engano
			//MergeSort.ordenar(vetor);
			//MergeSort.ordenarInsertion(vetor); // Merge com InsertSort
			//QuickSort.ordenar(vetor);
			//HeapSort.ordenar(vetor); // Talvez, para valores muito pequenos, o heapsort seja estavel
			//Arrays.sort(vetor); // MergeSort JDK

			double elapsedTime = (System.nanoTime()-startTime)/1000000;
			System.out.println(elapsedTime + "ms");
			// Calcula o tempo de execução em milissegundos, porque o Eclipse não exibe esse tempo sozinho
			
			/*System.out.println("Vetor ordenado:");
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("[" + vetor[i].getChave() + ", " + vetor[i].getValor() + "]");
			}*/
			
		} catch (InputMismatchException e) {
			System.out.println("Insira um número inteiro!!!");
		}
	}
}

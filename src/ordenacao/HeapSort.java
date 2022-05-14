package ordenacao;

import java.lang.Math;
import armazenamento.Estrutura;

public class HeapSort {
	private static long countComparacoes = 0;
	private static long countAtribuicoes1 = 0;
	private static int countAtribuicoes2 = 0;
	
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		countComparacoes = 0;
		countAtribuicoes1 = 0;
		buildMaxHeap(vetor, vetor.length-1);
		for(int i = vetor.length - 1; i >= 1; i--) {
			Estrutura<?, ?> aux = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = aux;
			countAtribuicoes1 += 3;
			maxHeapify(vetor, 0, i - 1);
		}
		System.out.println("Numero de comparacoes = " + countComparacoes + "\nNumero de atribuicoes = " + countAtribuicoes1);
	}
	
	private static void buildMaxHeap(Estrutura<?, ?>[] vetor, int tamanho) {
		for(int i = (int)Math.floor((double)tamanho/2); i >= 0; i--) {
			//System.out.println(i);
			maxHeapify(vetor, i, tamanho);
		}
	}

	private static void maxHeapify(Estrutura<?, ?>[] vetor, int indice, int tamanhoAtual) {
		int e = esq(indice);
		int d = dir(indice);
		int maior;
		
		if(e <= tamanhoAtual && vetor[e].compararCom(vetor[indice].getChave()) > 0) {
			maior = e;
		} else {
			maior = indice;
		}
		
		if (d <= tamanhoAtual && vetor[d].compararCom(vetor[maior].getChave()) > 0) {
			maior = d;
		}
		
		countComparacoes += 3;
		
		if(maior != indice) {
			countAtribuicoes1 += 3;
			Estrutura<?, ?> aux = vetor[maior];
			vetor[maior] = vetor[indice];
			vetor[indice] = aux;
			
			maxHeapify(vetor, maior, tamanhoAtual);
		}
	}
	
	private static int esq(int indice) {
		return 2*indice;
	}
	
	private static int dir(int indice) {
		return 2*indice+1;
	}
}

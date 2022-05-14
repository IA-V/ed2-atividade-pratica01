package ordenacao;

import armazenamento.Estrutura;

public class QuickSort {
	private static long countComparacoes = 0;
	private static long countAtribuicoes1 = 0;
	
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		countComparacoes = 0;
		countAtribuicoes1 = 0;
		Estrutura<?, ?>[] temp = new Estrutura[vetor.length];
		
		quickSort(vetor, 0, vetor.length-1);
		System.out.println("Numero de comparacoes = " + countComparacoes + "\nNumero de atribuicoes = " + countAtribuicoes1);
	}
	
	private static void quickSort(Estrutura<?, ?>[] vetor, int inicio, int fim) {
		countComparacoes++;
		if(inicio < fim) {
			int posicaoPivo = particiona(vetor, inicio, fim);
			
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}
	
	private static int particiona(Estrutura<?, ?>[] vetor, int inicio, int fim) {
		Estrutura<?, ?> pivo = vetor[inicio];
		int i = inicio + 1;
		int f = fim;
		
		while(i <= f) {
			countComparacoes += 2;
			if(vetor[i].compararCom(pivo.getChave()) <= 0) {
				i++;
			} else if(vetor[f].compararCom(pivo.getChave()) > 0) {
				f--;
			} else {
				countAtribuicoes1 += 3;
				Estrutura<?, ?> troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		countAtribuicoes1 += 2;
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}

package ordenacao;

import armazenamento.Estrutura;

public class QuickSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		Estrutura<?, ?>[] temp = new Estrutura[vetor.length];
		
		quickSort(vetor, 0, vetor.length-1);
	}
	
	private static void quickSort(Estrutura<?, ?>[] vetor, int inicio, int fim) {
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
			if(vetor[i].compararCom(pivo.getChave()) <= 0) {
				i++;
			} else if(vetor[i].compararCom(pivo.getChave()) > 0) {
				f--;
			} else {
				Estrutura<?, ?> troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}

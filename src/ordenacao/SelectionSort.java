package ordenacao;

import armazenamento.Estrutura;

public class SelectionSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		for(int i = 0; i < vetor.length-1; i++) {
			int min = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j].compararCom(vetor[min].getChave()) < 0) {
					// Se o retorno do m�todo for menor que 1, ent�o o valor que est� em "j" � menor que o que est� em "min"
					min = j;
				}
			}
			
			Estrutura<?, ?> aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;
		}
	}
}

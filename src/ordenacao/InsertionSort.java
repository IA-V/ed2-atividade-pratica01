package ordenacao;

import armazenamento.Estrutura;

public class InsertionSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		Estrutura<?, ?> chave;
		for(int i = 1; i < vetor.length; i++) {
			chave = vetor[i];
			int j;
			for(j = i-1; j >= 0 && vetor[j].compararCom(chave.getChave()) > 0; j--) {
				vetor[j+1] = vetor[j];
			}
			vetor[j+1] = chave;
		}
		
	}
}

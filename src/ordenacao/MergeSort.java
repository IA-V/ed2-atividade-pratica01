package ordenacao;

import armazenamento.Estrutura;

public class MergeSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		Estrutura<?, ?>[] temp = new Estrutura[vetor.length];
	}
	
	private Estrutura<?, ?>[] mergeMain(Estrutura<?, ?>[] vetor, Estrutura<?, ?>[] temp, int esq, int dir) {
		int meio;
		
		if(esq < dir) {
			meio = (esq+dir)/2;
			mergeMain(vetor, temp, esq, meio);
			mergeMain(vetor, temp, meio+1, dir);
		}
		
		return vetor;
	}
	
	private Estrutura<?, ?>[] merge(Estrutura<?, ?>[] vetor, Estrutura<?, ?>[] temp, int esqPos, int dirPos, int dirFim) {
		
	}
}

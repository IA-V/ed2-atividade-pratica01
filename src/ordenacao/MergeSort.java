package ordenacao;

import armazenamento.Estrutura;

public class MergeSort {
	public static void ordenar(Estrutura[] vetor) {
		Estrutura[] temp = new Estrutura[vetor.length];
		
		mergeMain(vetor, temp, 0, vetor.length-1);
	}
	
	private static Estrutura[] mergeMain(Estrutura[] vetor, Estrutura[] temp, int esq, int dir) {
		int meio;
		
		if(esq < dir) {
			meio = (esq+dir)/2;
			mergeMain(vetor, temp, esq, meio);
			mergeMain(vetor, temp, meio+1, dir);
			merge(vetor, temp, esq, meio+1, dir);
		}
		
		return vetor;
	}
	
	private static void merge(Estrutura[] vetor, Estrutura[] temp, int esqPos, int dirPos, int dirFim) {
		int esqFim = dirPos-1;
		int tempPos = esqPos;
		int numElem = dirFim - esqPos + 1;
		
		while(esqPos <= esqFim && dirPos <= dirFim) {
			if(vetor[esqPos].compararCom(vetor[dirPos].getChave()) <= 0) {
				temp[tempPos++] = vetor[esqPos++];
			} else {
				temp[tempPos++] = vetor[dirPos++];
			}
		}
		
		while(esqPos <= esqFim) {
			temp[tempPos++] = vetor[esqPos++];
		}
		
		while(dirPos <= dirFim) {
			temp[tempPos++] = vetor[dirPos++];
		}
		
		for(int i = 0; i < numElem; i++, dirFim--) {
			vetor[dirFim] = temp[dirFim];
		}
	}
}

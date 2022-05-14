package ordenacao;

import armazenamento.Estrutura;

public class MergeSort {
	
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		Estrutura<?, ?>[] temp = new Estrutura[vetor.length];
		
		mergeMain(vetor, temp, 0, vetor.length-1);
	}
	
	public static void ordenarInsertion(Estrutura<?, ?>[] vetor) {
		Estrutura<?, ?>[] temp = new Estrutura[vetor.length];
		
		mergeMainInsertion(vetor, temp, 0, vetor.length-1);
	}
	
	private static Estrutura<?, ?>[] mergeMainInsertion(Estrutura<?, ?>[] vetor, Estrutura<?, ?>[] temp, int esq, int dir) {
		int meio;
		if(esq < dir) {
			int numElem = dir-esq+1;
			if(numElem > 15) {
				meio = (esq+dir)/2;
				mergeMain(vetor, temp, esq, meio);
				mergeMain(vetor, temp, meio+1, dir);
				merge(vetor, temp, esq, meio+1, dir);
			} else { 						// Se o subconjunto tiver 15 elementos ou menos, o insertion sort é utilizado 
				System.out.println(numElem);
				Estrutura<?, ?> chave;
				for(int i = esq+1; i <= dir; i++) {
					chave = vetor[i];
					int j;
					for(j = i-1; j >= esq && vetor[j].compararCom(chave.getChave()) > 0; j--) {
						vetor[j+1] = vetor[j];
					}
					vetor[j+1] = chave;
				}
			}
		}
		
		return vetor;
	}
	
	private static Estrutura<?, ?>[] mergeMain(Estrutura<?, ?>[] vetor, Estrutura<?, ?>[] temp, int esq, int dir) {
		int meio;
		
		if(esq < dir) {
			meio = (esq+dir)/2;
			mergeMain(vetor, temp, esq, meio);
			mergeMain(vetor, temp, meio+1, dir);
			merge(vetor, temp, esq, meio+1, dir);
		}
		
		return vetor;
	}
	
	private static void merge(Estrutura<?, ?>[] vetor, Estrutura<?, ?>[] temp, int esqPos, int dirPos, int dirFim) {
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

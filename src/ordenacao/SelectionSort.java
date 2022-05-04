package ordenacao;

import java.lang.Math;
import armazenamento.Estrutura;

public class SelectionSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		for(int i = 0; i < vetor.length-1; i++) {
			int min = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j].compararCom(vetor[min].getChave()) < 0) {
					// Se o retorno do método for menor que 0, então o valor que está em "j" é menor que o que está em "min"
					min = j;
				}
			}
			
			Estrutura<?, ?> aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;
			
			for(int m = 0; m < vetor.length; m++) {
				System.out.println("[" + vetor[m].getChave() + "]");
			}
			System.out.println();
		}
	}
	
	public static void ordenarMinMax(Estrutura<?, ?>[] vetor) {		
		/* Inicializa "i" com o primeiro índice e "k" com o último índice.
		 * A condição é "i < k" porque, a partir de "k" até o último elemento, o array já estará ordenado.
		 */
		for(int i = 0, k = vetor.length-1; i < k; i++, k--) {
			int min = i;
			int max = k;
			
			/* Aqui no "for" interno, "j <= k" se deve ao fato de que não é necessário sempre iterar sobre todo o array, pois de "k" (k > 0) até
			 * "vetor.length-1", os elementos serão sempre maiores que "min". O mesmo se aplica de "k-1" até o 1º elemento.
			 */
			for(int j = i+1, l = k-1; j <= k; j++, l--) {
				
				// Se o retorno do método for menor que 0, então o valor que está em "j" é menor que o que está em "min"
				if(vetor[j].compararCom(vetor[min].getChave()) < 0) {
					min = j;
				}
				
				// Se o retorno do método for maior que 0, então o valor que está em "l" é maior que o que está em "max"
				if(vetor[l].compararCom(vetor[max].getChave()) > 0) {
					max = l;
				}
			}
			
			Estrutura<?, ?> aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;
			
			/* Se "max" for igual a "i", "max" deve receber "min" porque "i" e "min" já tiveram seus valores trocados nas linhas 46-48, o que significa que
			 * o maior valor está, agora, em "min".
			 */
			if(max == i) {
				max = min;
			}
			
			aux = vetor[k];
			vetor[k] = vetor[max];
			vetor[max] = aux;
		}
	}
}

package ordenacao;

import java.lang.Math;
import armazenamento.Estrutura;

public class SelectionSort {
	public static void ordenar(Estrutura<?, ?>[] vetor) {
		for(int i = 0; i < vetor.length-1; i++) {
			int min = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j].compararCom(vetor[min].getChave()) < 0) {
					// Se o retorno do m�todo for menor que 0, ent�o o valor que est� em "j" � menor que o que est� em "min"
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
		/* Inicializa "i" com o primeiro �ndice e "k" com o �ltimo �ndice.
		 * A condi��o � "i < k" porque, a partir de "k" at� o �ltimo elemento, o array j� estar� ordenado.
		 */
		for(int i = 0, k = vetor.length-1; i < k; i++, k--) {
			int min = i;
			int max = k;
			
			/* Aqui no "for" interno, "j <= k" se deve ao fato de que n�o � necess�rio sempre iterar sobre todo o array, pois de "k" (k > 0) at�
			 * "vetor.length-1", os elementos ser�o sempre maiores que "min". O mesmo se aplica de "k-1" at� o 1� elemento.
			 */
			for(int j = i+1, l = k-1; j <= k; j++, l--) {
				
				// Se o retorno do m�todo for menor que 0, ent�o o valor que est� em "j" � menor que o que est� em "min"
				if(vetor[j].compararCom(vetor[min].getChave()) < 0) {
					min = j;
				}
				
				// Se o retorno do m�todo for maior que 0, ent�o o valor que est� em "l" � maior que o que est� em "max"
				if(vetor[l].compararCom(vetor[max].getChave()) > 0) {
					max = l;
				}
			}
			
			Estrutura<?, ?> aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;
			
			/* Se "max" for igual a "i", "max" deve receber "min" porque "i" e "min" j� tiveram seus valores trocados nas linhas 46-48, o que significa que
			 * o maior valor est�, agora, em "min".
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

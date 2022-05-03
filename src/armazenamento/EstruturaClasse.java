package armazenamento;

import java.util.Comparator;

public abstract class EstruturaClasse<K, V> { 			// Estrutura genérica que estará contida no array
	protected K chave;
	protected V valor;
	
	public EstruturaClasse(K chave, V valor) {
		this.valor = valor;
		this.chave = chave;
	}
	
	public K getChave() {
		return this.chave;
	}
	
	public Object getValor() { 				// Retorna o valor desta estrutura com seu tipo especificado
		if(this.valor instanceof Integer) {
			return (Integer)this.valor;
		} else if (this.valor instanceof Double) {
			return (Double)this.valor;
		} else {
			return (String)this.valor;
		}
	}
	
	public <K> int compararCom(K chaveP) {
		if(this.chave instanceof String) { 				// Usando "this.chave" como parametro de "compareTo()", o vetor é ordenado em ordem decrescente
			return((String)this.chave).compareTo((String)chaveP);
		} else if (this.chave instanceof Integer) { 				// Usando "this.chave" como 2º parametro, o vetor é ordenado em ordem decrescente
			return Integer.compare((int)this.chave, (int)chaveP); 
		} else { 				// Usando "this.chave" como 2º parametro, o vetor é ordenado em ordem decrescente
			return Double.compare((int)this.chave, (double)chaveP);
		}
	}
}

package armazenamento;

public class Estrutura<K, V> { 			// Estrutura genérica que estará contida no array
	Ordem tipoOrdem;
	private K chave;
	private V valor;
	
	public Estrutura(K chave, V valor, Ordem tipoOrdem) {
		this.valor = valor;
		this.chave = chave;
		this.tipoOrdem = tipoOrdem;
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
		if(this.tipoOrdem == Ordem.CRESCENTE) {
			return this.fazerComparacao(this.chave, chaveP); // Ordenação em ordem crescente
		} else {
			return this.fazerComparacao(chaveP, this.chave); // Ordenação em ordem decrescente (apenas inverte a ordem das chaves)
		}
	}
	
	private <K> int fazerComparacao(K chaveO, K chaveP) {
		if(chaveO instanceof String) {
			return((String)chaveO).compareTo((String)chaveP);
		} else if (chaveO instanceof Integer) {
			return Integer.compare((int)chaveO, (int)chaveP); 
		} else {
			return Double.compare((double)chaveO, (double)chaveP);
		}
	}
}

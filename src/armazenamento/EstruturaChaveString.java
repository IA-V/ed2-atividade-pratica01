package armazenamento;

public class EstruturaChaveString<K, V> implements Estrutura{
	private K chave;
	private V valor;
	
	public EstruturaChaveString(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return this.chave;
	}
	
	public Object getValor() { 				
		// Retorna o valor desta estrutura com seu tipo especificado
		return this.valor;
	}
	
	public <K> int compararCom(K chaveP) {
		// Usando "this.chave" como 2º parametro, o vetor é ordenado em ordem decrescente
		return((String)this.chave).compareTo((String)chaveP);
	}
}

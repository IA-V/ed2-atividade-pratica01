package armazenamento;

public class EstruturaChaveInteger<K, V> implements Estrutura {
	private K chave;
	private V valor;
	
	public EstruturaChaveInteger(K chave, V valor) {
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
		// Usando "this.chave" como 2� parametro, o vetor � ordenado em ordem decrescente
		return Integer.compare((int)this.chave, (int)chaveP); 
	}
}

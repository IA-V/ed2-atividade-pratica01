package armazenamento;

public class EstruturaChaveDouble<K, V> implements Estrutura{
	private K chave;
	private V valor;
	
	public EstruturaChaveDouble(K chave, V valor) {
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
	
	@Override
	public <K> int compararCom(K chaveP) {
		// Usando "this.chave" como 2º parametro, o vetor é ordenado em ordem decrescente
		return Double.compare((double)this.chave, (double)chaveP); 
	}
}

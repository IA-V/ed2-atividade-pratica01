package armazenamento;

public interface Estrutura/*<K, V>*/ {
	public Object getValor();
	public <K> int compararCom(K chaveP);
	public <K> K getChave();
}

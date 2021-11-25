package pilhaMensagens;

public class PilhaMensagens {

	private String mensagem[] = new String[10];
	private int topo;

	public boolean isFull() {
		if (topo == mensagem.length)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}
	
	public void push(String valor) {
		if (!isFull()) {
			mensagem[topo] = valor;
			topo++;
		} else
			System.out.println("\nPilha cheia!");
	}

	public String pop() {
		topo--;
		return mensagem[topo];
	}

}

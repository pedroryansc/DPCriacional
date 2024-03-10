package builder2;

public class Pizza {

	private int tamanho = 10;
	private boolean queijo = false;
	private boolean tomate = false;
	private boolean milho = false;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isQueijo() {
		return queijo;
	}

	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}

	public boolean isTomate() {
		return tomate;
	}

	public void setTomate(boolean tomate) {
		this.tomate = tomate;
	}

	public boolean isMilho() {
		return milho;
	}

	public void setMilho(boolean milho) {
		this.milho = milho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [tamanho=");
		builder.append(tamanho);
		builder.append(", queijo=");
		builder.append(queijo);
		builder.append(", tomate=");
		builder.append(tomate);
		builder.append(", milho=");
		builder.append(milho);
		builder.append("]");
		return builder.toString();
	}
	
}
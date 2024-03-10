package builder2;

public class PizzaMilho implements IPizza {

	public void tamanho(int tamanho) {
		pizza.setTamanho(tamanho);
	}
	
	public void queijo() {
		pizza.setQueijo(false);
	}
	
	public void tomate() {
		pizza.setTomate(false);
	}
	
	public void milho() {
		pizza.setMilho(true);
	}
	
}
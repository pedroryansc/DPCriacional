package builder2;

public class PizzaTomate implements IPizza {

	public void tamanho(int tamanho) {
		pizza.setTamanho(tamanho);
	}
	
	public void queijo() {
		pizza.setQueijo(false);
	}
	
	public void tomate() {
		pizza.setTomate(true);
	}
	
	public void milho() {
		pizza.setMilho(false);
	}
	
}
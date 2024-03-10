package builder2;

public class PizzaQueijo implements IPizza {

	public void tamanho(int tamanho) {
		pizza.setTamanho(tamanho);
	}
	
	public void queijo() {
		pizza.setQueijo(true);
	}
	
	public void tomate() {
		pizza.setTomate(false);
	}
	
	public void milho() {
		pizza.setMilho(false);
	}
	
}
package builder2;

public class PizzaDirector {

	protected IPizza builder;
	
	public PizzaDirector(IPizza pizzabuilder) {
		this.builder = pizzabuilder;
	}
	
	public void construirPizza(int tamanho) {
		builder.tamanho(tamanho);
		builder.queijo();
		builder.tomate();
		builder.milho();
	}
	
	public Pizza getPizza() {
		return builder.build();
	}
	
}
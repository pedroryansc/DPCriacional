package builder2;

public interface IPizza {

	Pizza pizza = new Pizza();
	
	public void tamanho(int tamanho);
	
	public void queijo();
	
	public void tomate();
	
	public void milho();
	
	public default Pizza build() {
		return pizza;
	}
	
}
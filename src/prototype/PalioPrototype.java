package prototype;

public class PalioPrototype extends CarroPrototype {

	private PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
	}
	
	public PalioPrototype() {
		valorCompra = 0.0;
	}
	
	public String exibirInfo() {
		return "Modelo: Palio \nMontadora: Fiat \nValor: R$" + getValorCompra();
	}
	
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}
	
}
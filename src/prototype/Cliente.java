package prototype;

public class Cliente {
	public static void main(String[] args) {
		PalioPrototype prototipoPalio = new PalioPrototype();
		CarroPrototype palioNovo = prototipoPalio.clonar();
		palioNovo.setValorCompra();
	}
}
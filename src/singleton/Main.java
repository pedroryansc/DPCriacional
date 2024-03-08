package singleton;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Objeto.teste());
		
		Objeto obj1 = Objeto.getInstance();
		Objeto obj2 = Objeto.getInstance();
		Objeto obj3 = Objeto.getInstance();
		
		obj1.setCodigo(1);
		obj2.setMsg("Teste");
		obj3.setTipo(true);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
import iesdomingoperezminik.bloque4.nuevasClases.ContadorCircular;

public class PruebaContadorCircular {

	public static void main(String[] args) {
		ContadorCircular c;
		int i;
		
		c = new ContadorCircular();
		c.setTope(5);
		c.set(3);
		c.set(10);
		System.out.println("Contador: "+c.get());
		for (i = 1; i <= 40; i++) {
			c.incrementar();
			System.out.println("Contador: "+c.get());			
		}
	}

}

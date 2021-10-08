

public class Pruebas {

	public static void main(String[] args) {
		String a = "hola";
		String b = a;
		System.out.println(a + b);
		a = "Adios";
		System.out.println(a + b);

		StringBuffer sba = new StringBuffer("hola");
		StringBuffer sbb = sba;
		System.out.println(sba.toString() + sbb.toString());
		sba.setLength(0);
		sba.append("Adios");
		System.out.println(sba.toString() + sbb.toString());
		sbb.insert(2, 3==5);
		//sba.delete(2, 5);
		//sba.delete(0, 1);
		System.out.println(sba.toString() + sbb.toString());
		System.out.println(sba.length());
	}
}
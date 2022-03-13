package base;

public class Triangulo implements Comparable<Triangulo>{
	private double a,b,c;
	public Triangulo(double a, double b, double c) {
		if(!esValido(a,b,c))
			throw new LadosIlegalesException();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	private static boolean esValido(double a, double b, double c) {
		return a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a;
	}

	public double area() {
		double s;
		s=(a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	@Override
	public boolean equals(Object obj) {
		boolean resultado;
		if(obj==this)
			resultado = true;
		else if(obj instanceof Triangulo) {
			Triangulo t=(Triangulo)obj;
			resultado = (t.area()==area());
		} else
			resultado = false;
		return resultado;
	}
	
	@Override
	public int compareTo(Triangulo o) {
		int sol;
		if(area() < o.area())
			sol = -1;
		else if(area() > o.area())
			sol = 1;
		else 
			sol = 0;
		return sol;
	}
	
}

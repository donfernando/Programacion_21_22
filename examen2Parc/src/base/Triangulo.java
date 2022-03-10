package base;

public class Triangulo implements Comparable<Triangulo>{
	private int a,b,c;
	public Triangulo(int a, int b, int c) {
		if(!esValido(a,b,c))
			throw new LadosIlegalesException();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	private boolean esValido(int a, int b, int c) {
		return a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a;
	}

	public double area() {
		double s;
		s=(a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj instanceof Triangulo) {
			Triangulo t=(Triangulo)obj;
			return t.area()==area();
		}
		return false;
	}
	
	@Override
	public int compareTo(Triangulo o) {
		if(area() < o.area())
			return -1;
		else if(area() > o.area())
			return 1;
		else
			return 0;
	}
	
}

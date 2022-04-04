package dpm.bloque6.interfaces;

public class Ejercicios {
	public static Object menor(Object obj1, Object obj2) {
		@SuppressWarnings("unchecked")
		Comparable<Object> comp1=(Comparable<Object>)obj1;
		Object menor;
		if(comp1.compareTo(obj2)<=0)
			menor=obj1;
		else
			menor=obj2;
		return menor;
	}
	
	public static Object menor(Object obj1, Object obj2, Object obj3) {
		return menor(menor(obj1,obj2),obj3);
	}
}
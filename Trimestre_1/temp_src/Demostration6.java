class ClassEx6 {
	// The following method supports variable-length arguments
	public int sum(int... vararg) {
		System.out.println("You have passed " + vararg.length + " arguments now.");
		int total = 0;
		for (int i = 0; i < vararg.length; i++) {
			total = total + vararg[i];			
		}
		return total;
	}
}

public class Demostration6 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-6. Methods with variable-length argument demo ***\n");
		ClassEx6 ob = new ClassEx6();
		int resultOfSummation = ob.sum(1, 2, 3, 4, 5);
		System.out.println("Sum of 57 and 63 is : " + resultOfSummation);
	}
}
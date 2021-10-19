import java.util.Scanner;
public class Triangulo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        float A,B,C,perimetro;
        boolean otro;
        do {
            System.out.println("Escriba el parámetro A: ");
            A = entrada.nextFloat();
            System.out.println("Escriba el parámetro B: ");
            B = entrada.nextFloat();
            System.out.println("Escriba el parámetro C: ");
            C = entrada.nextFloat();
            if(A+B>C && A+C>B && B+C>A) {
                perimetro=A+B+C;
                System.out.println("El perímetro es: "+(float)perimetro);
            }else {
                System.out.println("Los lados no pertenecen a un triángulo");
            }
            System.out.println("Quiere calcular otra: ");
            otro = entrada.nextBoolean();
        }while (otro);
        entrada.close();
    }

}
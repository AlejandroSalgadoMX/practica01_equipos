import java.util.Scanner;

public class MorelosKevin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir números
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Suma
        int resultado = num1 + num2;


        System.out.println("La suma es: " + resultado);

        scanner.close();
    }
}
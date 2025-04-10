//Ejercicio 8 - Sumar N números positivos ingresados por el usuario (while)
//Importar librería
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres sumar? ");

        double total = 0;
        int cantidad = leer.nextInt();
        int posicion = 1;

        if (cantidad < 0) {
            System.out.println("Debe ingresar un número positivo");
        } else {
            while (cantidad >= 1) {
                System.out.println("Número " + posicion + ":");
                posicion = posicion + 1;
                double numero = leer.nextDouble();
                total = total + numero;
                cantidad = cantidad - 1;
            }
            System.out.println("La suma total es: " + total);
        }
    }
}

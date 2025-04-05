//Ejercicio 3 - Cifras (IF)
//Importar librería
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = leer.nextInt();

        if (numero < 0 || numero > 999) {
            System.out.println("El número a ingresar debe ser estar dentro del rango 0 a 999");
        } else if (numero <= 9) {
            System.out.println("El número " + numero + " es de 1 cifra ");
        } else if (numero <= 99) {
            System.out.println("El número " + numero + " es de 2 cifras");
        } else {
            System.out.println("El número " + numero + " es de 3 cifras");
        }
    }

}



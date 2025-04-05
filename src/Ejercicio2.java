//Ejercicio 2 - Par o Impar (operador ternario)
//Importar librería
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = leer.nextInt();

        if (numero == 0) {
            System.out.println("El número " + numero + " es neutro");
        }
        else if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
    }
}

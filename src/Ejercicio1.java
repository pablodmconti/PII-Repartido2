//Ejercicio 1 - Positivo o Negativo (IF)
//Importar librería
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese número:");
        int numero = leer.nextInt();

        if (numero < 0){
            System.out.println("El valor ingresado ("+ numero +") es negativo");
        } else if (numero > 0){
            System.out.println("El valor ingresado ("+ numero +") es positivo");
        } else {
            System.out.println("El valor ingresado ("+ numero +") es neutro");
        }
    }
}
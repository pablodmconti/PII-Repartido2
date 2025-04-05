//Ejercicio 4 - Mayor de 3 números (IF)
//Importar librería
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el 1er valor:");
        int numero1 = leer.nextInt();

        System.out.println("Ingrese el 2do valor:");
        int numero2 = leer.nextInt();

        System.out.println("Ingrese el 3er valor:");
        int numero3 = leer.nextInt();

        int numeromayor;

        if (numero1 >= numero2 && numero1 >= numero3){
            numeromayor = numero1;
        } else if (numero2 >= numero1 && numero2>= numero3){
            numeromayor = numero2;
        } else {
            numeromayor = numero3;
        }

        System.out.println("El valor mayor de los 3 es el número: " + numeromayor);
    }

}



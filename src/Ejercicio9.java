//Ejercicio 9 - Validar ingreso de contraseña (do-while)
//Importar librería
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String contrasenia = "java123";
        String ingreso;

        do {
            System.out.println("Ingresa tú contraseña: ");
            ingreso = leer.nextLine();

            if (!ingreso.equals(contrasenia)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!ingreso.equals(contrasenia)) ;
            System.out.println("¡Acceso correcto!");
        }
    }
//Ejercicio 5 - IMC (IF)
//Importar librería
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su peso corporal en kgs:");
        double peso = leer.nextDouble();

        System.out.println("Ingrese su altura en mts:");
        double altura = leer.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Se encuentra dentro del rango de peso insuficiente");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Se encuentra dentro del rango de peso normal o saludable");
        } else
            System.out.println("Se encuentra dentro del rango de obesidad");
    }
}


//Ejercicio 6 - Suma de números del 1 al 100 (for)
public class Ejercicio6 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("La suma de los números del 1 al 100 es: "+suma);
    }
}
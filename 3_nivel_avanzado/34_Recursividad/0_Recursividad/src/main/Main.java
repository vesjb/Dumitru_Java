package main;
import clases.Factorial;
public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        // Prueba del método recursivo
        int resultadoRecursivo = factorial.factorialRecursivo(1);

        // Prueba del método iterativo
        int resultadoIterativo = factorial.factorialIterativo(0);

        System.out.println("Factorial recursivo de 1: " + resultadoRecursivo);
        System.out.println("Factorial iterativo de 0: " + resultadoIterativo);
    }

}

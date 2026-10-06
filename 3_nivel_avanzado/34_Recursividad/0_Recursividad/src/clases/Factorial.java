package clases;

public class Factorial {
    //metodo recursivo

    public int factorialRecursivo(int n) {
        int resultado ;


        if (n == 1 || n == 0) {
            return 1;
        } 

        resultado = n * factorialRecursivo(n - 1);
        return resultado;
        
    }

    //metodo iterativo

    public int factorialIterativo(int n) {

        int resultado = 1;
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

}

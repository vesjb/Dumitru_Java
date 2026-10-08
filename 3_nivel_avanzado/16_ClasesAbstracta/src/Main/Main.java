package Main;
import Clases.Rectangulo;
import Clases.Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo(); 

        
        System.out.println("El area del triangulo es: " + triangulo.calcularArea(5, 10));
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea(5, 10));
    }


}

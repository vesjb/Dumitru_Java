package Clases;

public class Rectangulo extends Figura {
    //atributos
    double base;
    double altura;
    String nombre;

    //metodos

    private Rectangulo(double base, double altura, String nombre) {
        super(base, altura, nombre);
    }

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }


}

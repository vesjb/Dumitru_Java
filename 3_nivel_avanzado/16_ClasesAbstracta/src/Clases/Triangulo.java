package Clases;

public  class Triangulo extends Figura {
    private Triangulo(double base, double altura, String nombre) {
        super(base, altura, nombre);
    }
    @Override
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }   



}

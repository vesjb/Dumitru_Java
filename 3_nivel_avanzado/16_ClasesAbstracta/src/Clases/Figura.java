package Clases;

public abstract class Figura {
    //atributos
    double base;
    double altura;
    String nombre;

    //metodos
    public abstract double calcularArea(double base, double altura);
    //el metodo no tiene cuerpo, por eso es abstracto, y la clase tambien debe ser abstracta
    //constructor
    public Figura(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }




    

}

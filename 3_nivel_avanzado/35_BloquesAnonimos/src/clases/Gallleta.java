package clases;

public class Gallleta {
    private final int idgalleta;
    private static int contadorGalleta;

    public Gallleta() {

        System.out.println("Se ha creado el metodo constructor de la clase Gallleta");
    }


    //booque anonimo de tipo dinamico

    {

        System.out.println("Se ha creado un bloque de la clase Gallleta");
        this.idgalleta = Gallleta.contadorGalleta++;


    }

    //bloque anonimo de tipo estatico
    //no se puede usar el this en un bloque estatico

    static {
        System.out.println("Se ha creado un bloque estatico de la clase Gallleta");
        ++Gallleta.contadorGalleta;

    }
   
    public int getIdgalleta() {
        return idgalleta;  
    }
 

    

}

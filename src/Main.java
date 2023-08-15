
import animales.Delfin;
import animales.Gato;

public class Main {
    public static void main(String[] args) {
        //creacion de animales
        Gato gatito = new Gato("pepo","blanco", 2.0, 0.75, true);
        Delfin delfi = new Delfin();

        System.out.println("mi gato se llama: " + gatito.getNombre()+ " es de color " + gatito.getColor());
        System.out.println(gatito.moverse());
        System.out.println(delfi.moverse());

    }
}
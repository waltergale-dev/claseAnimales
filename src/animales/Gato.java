package animales;

public class Gato extends Animal {
    boolean tieneGarras;

    public Gato(String nombre, String color,double peso,double tamanio, boolean tieneGarras ) {
        super(nombre, color, peso, tamanio);

        this.tieneGarras = tieneGarras;
    }
    //SOBREESCRIBIMOS EL METODO MOVERSE
    @Override
    public String moverse(){
        return "EL GATO CORRE";
    }

}

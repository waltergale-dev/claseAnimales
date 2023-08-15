package animales;

public class Animal {
    // caracteristicas de un animal

    String nombre;
    String color;
    double peso, tamanio;

    public Animal (){};
    public Animal (String nombre, String color,double peso,double tamanio){
        this.nombre = nombre;
        this.color= color;
        this.peso = peso;
        this.tamanio = tamanio;
    }
    //Metodos getter y setter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }


    // comportaniento de los animales

        //comer
        //dormir
        // moverse
    public  String moverse(){
        return "el animal se esta moviendo";
    }

}

package objetos;

import java.util.Hashtable;

public class Campeon {
    String nombre;
    int precio;
    Hashtable<String, Atributo> atributos = new Hashtable<String, Atributo>();

    public Campeon(String nombre) {
        this.nombre = nombre;
    }

    public Campeon(String nombre, Hashtable<String, Atributo> atributos) {
        this.nombre = nombre;
        this.atributos = atributos;
    }

    public Campeon(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hashtable<String, Atributo> getAtributos() {
        return this.atributos;
    }

    public void setAtributos(Hashtable<String, Atributo> atributos) {
        this.atributos = atributos;
    }

    public void put_atributos_campeon(Atributo atributo) {
        this.atributos.put(atributo.getNombre(), atributo);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

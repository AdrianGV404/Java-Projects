package objetos;

public class Atributo {
    String nombre;
    int style = 0;
    int mejoras[];

    public Atributo(String nombre,int[] mejoras) {
        this.nombre = nombre;
        this.mejoras = mejoras;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getMejoras() {
        return mejoras;
    }

    public void setMejoras(int[] mejoras) {
        this.mejoras = mejoras;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }
}
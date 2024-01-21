package objetos;

import java.util.Hashtable;

public class Jugador {
    final int nivel_maximo = 11;
    int nivel;
    int experiencia_actual;
    int oro;
    int racha_victoria_o_derrota;
    int interes; // interes por defecto = 5
    int unidades_disponibles;
    Hashtable<String, Campeon> compo_actual;

    public Jugador() {
        this.nivel = 1;
        this.experiencia_actual = 0;
        this.oro = 0;
        this.racha_victoria_o_derrota = 0;
        this.interes = 5; // interes por defecto = 5
        this.unidades_disponibles = 1;
        this.compo_actual = new Hashtable<String, Campeon>();
    }

    @Override
    public String toString() {
        return "Jugador [LvL = " + nivel +
                "\nXP = " + experiencia_actual +
                "\nOro = " + oro +
                "\nRacha_victoria_o_derrota = " + racha_victoria_o_derrota +
                "\nInterés = " + interes +
                "\nUnidades_disponibles=" + unidades_disponibles;
    }

     public String compo_actual_toString() {
        return compo_actual.toString();
    }
    public int getNivel_maximo() {
        return nivel_maximo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia_actual() {
        return experiencia_actual;
    }

    public void setExperiencia_actual(int experiencia_actual) {
        this.experiencia_actual = experiencia_actual;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getRacha_victoria_o_derrota() {
        return racha_victoria_o_derrota;
    }

    public void setRacha_victoria_o_derrota(int racha_victoria_o_derrota) {
        this.racha_victoria_o_derrota = racha_victoria_o_derrota;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }

    public void setCompActual(Hashtable<String, Campeon> campeones) {
        this.compo_actual = campeones;
    }

    public void put_campeon_CompoActual(Campeon c) {
        this.compo_actual.put(c.getNombre(), c);
    }

    public void remove_campeon_CompoActual(Campeon c) {
        this.compo_actual.remove(c.getNombre(), c);
    }

    public int campeones_en_tablero() {
        return this.compo_actual.size();
    }

    
}

package set;

import java.util.Hashtable;

import objetos.Atributo;
import objetos.Campeon;

public class TFT_set {
    Hashtable<String, Campeon> campeones_Set;
    Hashtable<String, Atributo> atributos_Set;

    public TFT_set() {
        this.atributos_Set = new Hashtable<String, Atributo>();
        this.campeones_Set = new Hashtable<String, Campeon>();
    }

    public Hashtable<String, Atributo> getAtributos_Set9() {
        return this.atributos_Set;
    }

    public void setAtributos_Set(Hashtable<String, Atributo> atributos_Set) {
        this.atributos_Set = atributos_Set;
    }

    public Hashtable<String, Campeon> getCampeones_Set9() {
        return this.campeones_Set;
    }

    public void setCampeones_Set(Hashtable<String, Campeon> campeones_Set) {
        this.campeones_Set = campeones_Set;
    }

    public void put_campeon(Campeon c) {
        this.campeones_Set.put(c.getNombre(), c);
    }

    public void put_atributo(Atributo a) {
        this.atributos_Set.put(a.getNombre(), a);
    }

    public void put_atributo_campeon(String campeon, String atributo) {
        this.campeones_Set.get(campeon).put_atributos_campeon(atributos_Set.get(atributo));
    }
}

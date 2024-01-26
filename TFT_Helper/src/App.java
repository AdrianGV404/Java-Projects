import gui.*;
import inicializador.inicializa;
import inicializador.jugadores;
import set.TFT_set;

public class App {
    /*
     * 29 copias de 1 mismo campeon de coste 1
     * 22 copias de 1 mismo campeon de coste 2
     * 18 copias de 1 mismo campeon de coste 3
     * 12 copias de 1 mismo campeon de coste 4
     * 10 copias de 1 mismo campeon de coste 5
     * 
     * 0-9 oro -> +0
     * 10-9 oro -> +1 (interes)
     * 20-9 oro -> +2 (interes)
     * 30-9 oro -> +3 (interes)
     * 40-9 oro -> +4 (interes)
     * 50 oro -> +5 (interes)
     * 
     * 1 Win/Lose -> +0
     * 2 Win/Lose -> +1 (interes)
     * 3 Win/Lose -> +1 (interes)
     * 4 Win/Lose -> +2 (interes)
     * 5 Win/Lose -> +3 (interes)
     * 
     * pvp win -> +1 instantaneo
     */
    final static int[][] probabilidad_por_nivel = {
            { 100 },
            { 100 },
            { 75, 25 },
            { 55, 30, 15 },
            { 45, 33, 20, 2 },
            { 25, 40, 30, 5 },
            { 19, 30, 35, 15, 1 },
            { 16, 30, 35, 14, 4 },
            { 9, 15, 30, 30, 16 },
            { 5, 10, 20, 40, 25 },
            { 1, 2, 12, 50, 35 } };
    final static int nivel_maximo = 11;
    final static int[] campeones_disponibles_tier = { 29, 22, 18, 12, 10 };
    final static int[] experiencia_por_nivel = { 0, 2, 6, 10, 25, 40, 60, 84, 100 };
    static int ronda = 1; // de 1 a 9
    static int fase = 1; // de 1 a 6

    public static void main(String[] args) throws Exception {
        TFT_set set_actual = new TFT_set();
        // seria guay que sacara los campeones de una WEB y lo mismo con los atributos
        // leer info de web (atributos y campeones del set (y inicializar segun el set))
        inicializa.atributos_set(set_actual);
        inicializa.campeones_con_atributos_set(set_actual);
        new GUI();
        // ya usare los otros jugadores mas tarde

    }
}

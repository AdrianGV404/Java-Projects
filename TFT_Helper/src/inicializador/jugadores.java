package inicializador;

import objetos.Jugador;

public class jugadores {
    static Jugador main_player;
    static Jugador player_1;
    static Jugador player_2;
    static Jugador player_3;
    static Jugador player_4;
    static Jugador player_5;
    static Jugador player_6;
    static Jugador player_7;

    public jugadores() {
        main_player = new Jugador();
        player_1 = new Jugador();
        player_2 = new Jugador();
        player_3 = new Jugador();
        player_4 = new Jugador();
        player_5 = new Jugador();
        player_6 = new Jugador();
        player_7 = new Jugador();
    }

    public static Jugador getMain_player() {
        return main_player;
    }

    public static void setMain_player(Jugador main_player) {
        jugadores.main_player = main_player;
    }

    public static Jugador getPlayer_1() {
        return player_1;
    }

    public static void setPlayer_1(Jugador player_1) {
        jugadores.player_1 = player_1;
    }

    public static Jugador getPlayer_2() {
        return player_2;
    }

    public static void setPlayer_2(Jugador player_2) {
        jugadores.player_2 = player_2;
    }

    public static Jugador getPlayer_3() {
        return player_3;
    }

    public static void setPlayer_3(Jugador player_3) {
        jugadores.player_3 = player_3;
    }

    public static Jugador getPlayer_4() {
        return player_4;
    }

    public static void setPlayer_4(Jugador player_4) {
        jugadores.player_4 = player_4;
    }

    public static Jugador getPlayer_5() {
        return player_5;
    }

    public static void setPlayer_5(Jugador player_5) {
        jugadores.player_5 = player_5;
    }

    public static Jugador getPlayer_6() {
        return player_6;
    }

    public static void setPlayer_6(Jugador player_6) {
        jugadores.player_6 = player_6;
    }

    public static Jugador getPlayer_7() {
        return player_7;
    }

    public static void setPlayer_7(Jugador player_7) {
        jugadores.player_7 = player_7;
    }

}

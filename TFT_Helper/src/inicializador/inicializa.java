package inicializador;

import objetos.Atributo;
import objetos.Campeon;
import set.TFT_set;

public class inicializa {

    public static void atributos_set(TFT_set set) {
        set.put_atributo(new Atributo("Vacío", new int[] { 3, 6, 8 }));
        set.put_atributo(new Atributo("Noxus", new int[] { 3, 6, 9 }));
        set.put_atributo(new Atributo("Piltover", new int[] { 3, 6 }));
        set.put_atributo(new Atributo("Shurima", new int[] { 3, 5, 7, 9 }));
        set.put_atributo(new Atributo("Zaun", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Yordle", new int[] { 3, 5 }));
        set.put_atributo(new Atributo("Targon", new int[] { 2, 3, 4 }));
        set.put_atributo(new Atributo("Demacia", new int[] { 3, 5, 7, 9 }));
        set.put_atributo(new Atributo("Freljord", new int[] { 2, 3, 4 }));
        set.put_atributo(new Atributo("Islas Sombrías", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Jonia", new int[] { 3, 6, 9 }));

        set.put_atributo(new Atributo("Verdugo", new int[] { 2, 3, 4, 5, 6 }));
        set.put_atributo(new Atributo("Pícaro", new int[] { 2, 4 }));
        set.put_atributo(new Atributo("Estratega", new int[] { 2, 3, 4, 5 }));
        set.put_atributo(new Atributo("Hechizero", new int[] { 2, 4, 6, 8 }));
        set.put_atributo(new Atributo("Pistolero", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Multimago", new int[] { 2, 4 }));
        set.put_atributo(new Atributo("Coloso", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Conjurador", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Certero", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Luchador", new int[] { 2, 4, 6 }));
        set.put_atributo(new Atributo("Contendiente", new int[] { 2, 4, 6, 8 }));
        set.put_atributo(new Atributo("Bastión", new int[] { 2, 4, 6, 8 }));

        set.put_atributo(new Atributo("Darkin", new int[] { 1 }));
        set.put_atributo(new Atributo("Trotamundos", new int[] { 1 }));
        set.put_atributo(new Atributo("Emperatriz", new int[] { 1 }));
        set.put_atributo(new Atributo("Tecnogenio", new int[] { 1 }));
        set.put_atributo(new Atributo("Redentor", new int[] { 1 }));
    }

    public static void campeones_con_atributos_set(TFT_set set) {
        // Coste 1
        //_______________________________________________________________________
        set.put_campeon(new Campeon("Cassiopeia", 1));
        set.put_atributo_campeon("Cassiopeia", "Conjurador");
        set.put_atributo_campeon("Cassiopeia", "Noxus");
        set.put_atributo_campeon("Cassiopeia", "Shurima");

        set.put_campeon(new Campeon("Cho'Gath", 1));
        set.put_atributo_campeon("Cho'Gath", "Luchador");
        set.put_atributo_campeon("Cho'Gath", "Vacío");

        set.put_campeon(new Campeon("Irelia", 1));
        set.put_atributo_campeon("Irelia", "Contendiente");
        set.put_atributo_campeon("Irelia", "Jonia");

        set.put_campeon(new Campeon("Jhin", 1));
        set.put_atributo_campeon("Jhin", "Certero");
        set.put_atributo_campeon("Jhin", "Jonia");
        
        set.put_campeon(new Campeon("Kayle", 1));
        set.put_atributo_campeon("Kayle", "Verdugo");
        set.put_atributo_campeon("Kayle", "Demacia");

        set.put_campeon(new Campeon("Malzahar", 1));
        set.put_atributo_campeon("Malzahar", "Hechizero");
        set.put_atributo_campeon("Malzahar", "Vacío");

        set.put_campeon(new Campeon("Maokai", 1));
        set.put_atributo_campeon("Maokai", "Bastión");
        set.put_atributo_campeon("Maokai", "Islas Sombrías");

        set.put_campeon(new Campeon("Orianna", 1));
        set.put_atributo_campeon("Orianna", "Hechizero");
        set.put_atributo_campeon("Orianna", "Piltover");

        set.put_campeon(new Campeon("Poppy", 1));
        set.put_atributo_campeon("Poppy", "Bastión");
        set.put_atributo_campeon("Poppy", "Demacia");
        set.put_atributo_campeon("Poppy", "Yordle");

        set.put_campeon(new Campeon("Renekton", 1));
        set.put_atributo_campeon("Renekton", "Luchador");
        set.put_atributo_campeon("Renekton", "Shurima");

        set.put_campeon(new Campeon("Samira", 1));
        set.put_atributo_campeon("Samira", "Contendiente");
        set.put_atributo_campeon("Samira", "Noxus");

        set.put_campeon(new Campeon("Tristana", 1));
        set.put_atributo_campeon("Tristana", "Pistolero");
        set.put_atributo_campeon("Tristana", "Yordle");

        set.put_campeon(new Campeon("Viego", 1));
        set.put_atributo_campeon("Viego", "Pícaro");
        set.put_atributo_campeon("Viego", "Islas Sombrías");

        // Coste 2
        //_______________________________________________________________________
        set.put_campeon(new Campeon("Ashe", 2));
        set.put_atributo_campeon("Ashe", "Certero");
        set.put_atributo_campeon("Ashe", "Freljord");

        set.put_campeon(new Campeon("Galio", 2));
        set.put_atributo_campeon("Galio", "Conjurador");
        set.put_atributo_campeon("Galio", "Demacia");

        set.put_campeon(new Campeon("Jinx", 2));
        set.put_atributo_campeon("Jinx", "Pistolero");
        set.put_atributo_campeon("Jinx", "Zaun");

        set.put_campeon(new Campeon("Kassadin",2));
        set.put_atributo_campeon("Kassadin", "Bastión");
        set.put_atributo_campeon("Kassadin", "Vacío");

        set.put_campeon(new Campeon("Kled", 2));
        set.put_atributo_campeon("Kled", "Verdugo");
        set.put_atributo_campeon("Kled", "Noxus");
        set.put_atributo_campeon("Kled", "Yordle");

        set.put_campeon(new Campeon("Sett", 2));
        set.put_atributo_campeon("Sett", "Coloso");
        set.put_atributo_campeon("Sett", "Jonia");

        set.put_campeon(new Campeon("Soraka", 2));
        set.put_atributo_campeon("Soraka", "Conjurador");
        set.put_atributo_campeon("Soraka", "Targon");

        set.put_campeon(new Campeon("Swain", 2));
        set.put_atributo_campeon("Swain", "Estratega");
        set.put_atributo_campeon("Swain", "Hechizero");
        set.put_atributo_campeon("Swain", "Noxus");

        set.put_campeon(new Campeon("Taliyah", 2));
        set.put_atributo_campeon("Taliyah", "Multimago");
        set.put_atributo_campeon("Taliyah", "Shurima");

        set.put_campeon(new Campeon("Teemo", 2));
        set.put_atributo_campeon("Teemo", "Estratega");
        set.put_atributo_campeon("Teemo", "Multimago");
        set.put_atributo_campeon("Teemo", "Yordle");

        set.put_campeon(new Campeon("Vi", 2));
        set.put_atributo_campeon("Vi", "Luchador");
        set.put_atributo_campeon("Vi", "Piltover");

        set.put_campeon(new Campeon("Warwick", 2));
        set.put_atributo_campeon("Warwick", "Coloso");
        set.put_atributo_campeon("Warwick", "Contendiente");
        set.put_atributo_campeon("Warwick", "Zaun");

        set.put_campeon(new Campeon("Zed", 2));
        set.put_atributo_campeon("Zed", "Pícaro");
        set.put_atributo_campeon("Zed", "Verdugo");
        set.put_atributo_campeon("Zed", "Jonia");

        // Coste 3
        //_______________________________________________________________________
        set.put_campeon(new Campeon("Akshan",3));        
        set.put_atributo_campeon("Akshan", "Certero");
        set.put_atributo_campeon("Akshan", "Shurima");

        set.put_campeon(new Campeon("Darius",3));
        set.put_atributo_campeon("Darius", "Coloso");
        set.put_atributo_campeon("Darius", "Noxus");

        set.put_campeon(new Campeon("Ekko",3));
        set.put_atributo_campeon("Ekko", "Pícaro");
        set.put_atributo_campeon("Ekko", "Zaun");
        set.put_atributo_campeon("Ekko", "Piltover");

        set.put_campeon(new Campeon("Garen",3));
        set.put_atributo_campeon("Garen", "Coloso");
        set.put_atributo_campeon("Garen", "Demacia");

        set.put_campeon(new Campeon("Jayce",3));
        set.put_atributo_campeon("Jayce", "Pistolero");
        set.put_atributo_campeon("Jayce", "Piltover");

        set.put_campeon(new Campeon("Kalista",3));
        set.put_atributo_campeon("Kalista", "Contendiente");
        set.put_atributo_campeon("Kalista", "Islas Sombrías");

        set.put_campeon(new Campeon("Karma",3));
        set.put_atributo_campeon("Karma", "Conjurador");
        set.put_atributo_campeon("Karma", "Jonia");

        set.put_campeon(new Campeon("Katarina",3));
        set.put_atributo_campeon("Katarina", "Pícaro");
        set.put_atributo_campeon("Katarina", "Noxus");

        set.put_campeon(new Campeon("Lissandra",3));
        set.put_atributo_campeon("Lissandra", "Conjurador");
        set.put_atributo_campeon("Lissandra", "Freljord");

        set.put_campeon(new Campeon("Rek'Sai",3));
        set.put_atributo_campeon("Rek'Sai", "Luchador");
        set.put_atributo_campeon("Rek'Sai", "Vacío");

        set.put_campeon(new Campeon("Sona",3));
        set.put_atributo_campeon("Sona", "Multimago");
        set.put_atributo_campeon("Sona", "Demacia");


        set.put_campeon(new Campeon("Taric",3));
        set.put_atributo_campeon("Taric", "Bastión");
        set.put_atributo_campeon("Taric", "Hechizero");
        set.put_atributo_campeon("Taric", "Targon");

        set.put_campeon(new Campeon("Vel'Koz",3));
        set.put_atributo_campeon("Vel'Koz", "Hechizero");
        set.put_atributo_campeon("Vel'Koz", "Multimago");
        set.put_atributo_campeon("Vel'Koz", "Vacío");

        // Coste 4
        //_______________________________________________________________________
        set.put_campeon(new Campeon("Aphelios",4));
        set.put_atributo_campeon("Aphelios", "Certero");
        set.put_atributo_campeon("Aphelios", "Targon");

        set.put_campeon(new Campeon("Azir",4));
        set.put_atributo_campeon("Azir", "Estratega");
        set.put_atributo_campeon("Azir", "Shurima");

        set.put_campeon(new Campeon("Gwen",4));
        set.put_atributo_campeon("Gwen", "Islas Sombrías");
        set.put_atributo_campeon("Gwen", "Verdugo");

        set.put_campeon(new Campeon("Jarvan IV",4));
        set.put_atributo_campeon("Jarvan IV", "Estratega");
        set.put_atributo_campeon("Jarvan IV", "Demacia");

        set.put_campeon(new Campeon("Kai'Sa",4));
        set.put_atributo_campeon("Kai'Sa", "Contendiente");
        set.put_atributo_campeon("Kai'Sa", "Vacío");

        set.put_campeon(new Campeon("Lux",4));
        set.put_atributo_campeon("Lux", "Hechizero");
        set.put_atributo_campeon("Lux", "Demacia");
        
        set.put_campeon(new Campeon("Nasus",4));
        set.put_atributo_campeon("Nasus", "Coloso");
        set.put_atributo_campeon("Nasus", "Shurima");

        set.put_campeon(new Campeon("Sejuani",4));
        set.put_atributo_campeon("Sejuani", "Luchador");
        set.put_atributo_campeon("Sejuani", "Freljord");

        set.put_campeon(new Campeon("Shen",4));
        set.put_atributo_campeon("Shen", "Bastión");
        set.put_atributo_campeon("Shen", "Conjurador");
        set.put_atributo_campeon("Shen", "Jonia");

        set.put_campeon(new Campeon("Urgot",4));
        set.put_atributo_campeon("Urgot", "Certero");
        set.put_atributo_campeon("Urgot", "Zaun");

        set.put_campeon(new Campeon("Yasuo",4));
        set.put_atributo_campeon("Yasuo", "Contendiente");
        set.put_atributo_campeon("Yasuo", "Jonia");

        set.put_campeon(new Campeon("Zeri",4));
        set.put_atributo_campeon("Zeri", "Pistolero");
        set.put_atributo_campeon("Zeri", "Zaun");

        // Coste 5
        //_______________________________________________________________________
        set.put_campeon(new Campeon("Aatrox",5));
        set.put_atributo_campeon("Aatrox", "Darkin");
        set.put_atributo_campeon("Aatrox", "Coloso");
        set.put_atributo_campeon("Aatrox", "Verdugo");

        set.put_campeon(new Campeon("Ahri",5));
        set.put_atributo_campeon("Ahri", "Hechizero");
        set.put_atributo_campeon("Ahri", "Jonia");

        set.put_campeon(new Campeon("Bel'Veth",5));
        set.put_atributo_campeon("Bel'Veth", "Emperatriz");
        set.put_atributo_campeon("Bel'Veth", "Vacío");

        set.put_campeon(new Campeon("Heimerdinger",5));
        set.put_atributo_campeon("Heimerdinger", "Tecnogenio");
        set.put_atributo_campeon("Heimerdinger", "Piltover");
        set.put_atributo_campeon("Heimerdinger", "Yordle");

        set.put_campeon(new Campeon("K'Sante",5));
        set.put_atributo_campeon("K'Sante", "Bastión");
        set.put_atributo_campeon("K'Sante", "Shurima");

        set.put_campeon(new Campeon("Ryze",5));
        set.put_atributo_campeon("Ryze", "Trotamundos");
        set.put_atributo_campeon("Ryze", "Conjurador");

        set.put_campeon(new Campeon("Senna",5));
        set.put_atributo_campeon("Senna", "Redentor");
        set.put_atributo_campeon("Senna", "Pistolero");
        set.put_atributo_campeon("Senna", "Islas Sombrías");

        set.put_campeon(new Campeon("Sion",5));
        set.put_atributo_campeon("Sion", "Luchador");
        set.put_atributo_campeon("Sion", "Noxus");
    }
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int suma = 8;
        List<Integer> lista_A = Arrays.asList(1, 3, 6, 9);
        List<Integer> lista_B = Arrays.asList(1, 6, 2, 10);
        System.out.println("Entero: " + suma);
        System.out.println("Existe " + suma + " como suma de dos enteros en la lista: " + lista_A.toString() + " : "
                + buscar_suma_array(suma, lista_A));
        System.out.println("Existe " + suma + " como suma de dos enteros en la lista: " + lista_B.toString() + " : "
                + buscar_suma_array(suma, lista_B));
    }

    private static boolean buscar_suma_array(int suma, List<Integer> lista) {
        HashSet<Integer> hash = new HashSet<Integer>();
        int actual;
        for (int i = 0; i < lista.size(); i++) {
            actual = lista.get(i);
            if (hash.contains(actual))
                return true;
            hash.add(suma - actual);
        }
        return false;
    }
}

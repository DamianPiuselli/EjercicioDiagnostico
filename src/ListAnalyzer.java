import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> lista) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if (i == 0) {
                if (lista.get(i) + 1 == lista.get(i + 1)) {
                    consecutivos.add(lista.get(i));
                }
                continue;
            }

            if (i == lista.size() - 1) {
                if (lista.get(i) - 1 == lista.get(i - 1)) {
                    consecutivos.add(lista.get(i));
                }
                continue;
            }

            if (lista.get(i) + 1 == lista.get(i + 1) || lista.get(i) - 1 == lista.get(i - 1)) {
                consecutivos.add(lista.get(i));
            }
        }
        return consecutivos;
    }
}

public class MetodoSeleccion {

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ordenarDesSelecccion(arreglo);
        } else {
            ordenarAsdSelececion(arreglo);
        }
    }

    public void ordenarDesSelecccion(int[] arreglo) {
        int n = arreglo.length;
        // 10, 9, 21, 5, 15, 2, -1, 0
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }

    public void ordenarAsdSelececion(int[] arreglo) {
        int n = arreglo.length;
        // 10, 9, 21, 5, 15, 2, -1, 0
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[maxIdx] > arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }

}

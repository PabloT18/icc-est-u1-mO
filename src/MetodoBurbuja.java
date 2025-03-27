public class MetodoBurbuja {

    // def ordenar_asendente(arrreglo):

    public void ordenarAsendente(int[] arreglo) {
        int n = arreglo.length; // TAMANO del arreglo
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;

                }
            }

        }
    }

    public void ordenar(int[] arreglo, boolean isDes) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                // System.out.println("i=" + i + " j=" + j);
                if (isDes) {
                    if (arreglo[i] < arreglo[j]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                    }
                } else {
                    if (arreglo[i] > arreglo[j]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                    }
                }
            }
        }

    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}

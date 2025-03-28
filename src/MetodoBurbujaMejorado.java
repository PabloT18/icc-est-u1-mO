public class MetodoBurbujaMejorado {

    public int[] ordenarAscendente(int[] arreglo) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // System.out.println("Comparaciones: " + contComparaciones +
                // "-> " + arreglo[j] + ">" + arreglo[j + 1]);
                contComparaciones++;
                if (arreglo[i] > arreglo[j]) {
                    contCambios++;
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
            // System.out.print("Estado Actual ->");
            // imprimirArreglo(arreglo);
        }
        int[] respuestas = { contComparaciones, contCambios };
        return respuestas;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println();
    }
}

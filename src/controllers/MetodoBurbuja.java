package controllers;

/**
 * Clase que implementa el método de ordenamiento por burbuja mejorado.
 * 
 * Este algoritmo ordena un arreglo de enteros en orden ascendente utilizando el
 * método de burbuja mejorado. El método cuenta el número de comparaciones y
 * cambios realizados durante el proceso de ordenamiento.
 *
 * Complejidad:
 * - Peor caso: O(n^2), cuando el arreglo está ordenado en orden descendente.
 * - Mejor caso: O(n), cuando el arreglo ya está ordenado.
 */
public class MetodoBurbuja {

    /**
     * Método que ordena un arreglo de enteros en orden ascendente utilizando el
     * método de burbuja mejorado.
     *
     * @param arreglo El arreglo de enteros a ordenar.
     */
    public void ordenarAsendente(int[] arreglo) {
        int n = arreglo.length;
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

    /**
     * Método que ordena un arreglo de enteros en orden descendente utilizando el
     * método de burbuja mejorado.
     *
     * @param arreglo El arreglo de enteros a ordenar.
     */
    public void ordenar(int[] arreglo, boolean isDes) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
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

}

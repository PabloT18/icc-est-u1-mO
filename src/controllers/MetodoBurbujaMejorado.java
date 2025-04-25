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
public class MetodoBurbujaMejorado {

    /**
     * Ordena un arreglo de enteros en orden ascendente utilizando el método de
     * burbuja mejorado.
     *
     * @param arreglo El arreglo de enteros a ordenar.
     * @return Un arreglo que contiene el número de comparaciones y cambios
     *         realizados
     *         durante el proceso de ordenamiento.
     *
     *         El método implementa el algoritmo de ordenamiento por burbuja
     *         mejorado, que consiste en recorrer el arreglo y comparar elementos
     *         adyacentes, intercambiándolos si están en el orden incorrecto. Este
     *         proceso se repite hasta que no se realizan más intercambios.
     *
     *         Complejidad:
     *         - Peor caso: O(n^2), cuando el arreglo está ordenado en orden
     *         descendente.
     *         - Mejor caso: O(n), cuando el arreglo ya está ordenado.
     */
    public int[] ordenarAscendente(int[] arreglo) {
        int n = arreglo.length; // Longitud del arreglo
        int contComparaciones = 0; // Contador para el número de comparaciones realizadas
        int contCambios = 0; // Contador para el número de intercambios realizados

        // Bucle externo que recorre cada elemento del arreglo
        for (int i = 0; i < n; i++) {
            // Bucle interno que compara el elemento actual con los siguientes
            for (int j = i + 1; j < n; j++) {
                contComparaciones++; // Incrementa el contador de comparaciones

                // Si el elemento actual es mayor que el siguiente, se realiza un intercambio
                if (arreglo[i] > arreglo[j]) {
                    contCambios++; // Incrementa el contador de intercambios
                    int aux = arreglo[i]; // Variable auxiliar para realizar el intercambio
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        // Arreglo que contiene el número total de comparaciones y cambios realizados
        int[] respuestas = { contComparaciones, contCambios };
        return respuestas; // Retorna el arreglo con los contadores
    }

}

package controllers;

public class MetodoSeleccion {

    /**
     * Ordena un arreglo de enteros utilizando el método de selección.
     * 
     * @param arreglo El arreglo de enteros a ordenar.
     * @param isDes   Indica si el orden es descendente (true) o ascendente (false).
     */
    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ordenarDesSelecccion(arreglo);
        } else {
            ordenarAsdSelececion(arreglo);
        }
    }

    /**
     * Ordena un arreglo de enteros en orden descendente utilizando el método de
     * selección.
     * 
     * @param arreglo El arreglo de enteros a ordenar.
     */
    public void ordenarDesSelecccion(int[] arreglo) {
        int n = arreglo.length; // Obtiene la longitud del arreglo.
        // Recorre el arreglo para encontrar el elemento máximo en cada iteración.
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // Inicializa el índice del elemento máximo como el actual.
            for (int j = i + 1; j < n; j++) { // Recorre los elementos restantes del arreglo.
                if (arreglo[maxIdx] < arreglo[j]) { // Compara si el elemento actual es mayor que el máximo.
                    maxIdx = j; // Actualiza el índice del elemento máximo.
                }
            }
            if (maxIdx != i) { // Si el índice del máximo no es el actual, realiza el intercambio.
                int aux = arreglo[maxIdx]; // Guarda el valor del elemento máximo en una variable auxiliar.
                arreglo[maxIdx] = arreglo[i]; // Asigna el valor del elemento actual al índice del máximo.
                arreglo[i] = aux; // Asigna el valor del máximo al índice actual.
            }
        }
    }

    /**
     * Ordena un arreglo de enteros en orden ascendente utilizando el método de
     * selección.
     * 
     * @param arreglo El arreglo de enteros a ordenar.
     */
    public void ordenarAsdSelececion(int[] arreglo) {
        int n = arreglo.length; // Obtiene la longitud del arreglo.

        // Recorre el arreglo para encontrar el elemento mínimo en cada iteración.
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // Inicializa el índice del elemento mínimo como el actual.
            for (int j = i + 1; j < n; j++) { // Recorre los elementos restantes del arreglo.
                if (arreglo[maxIdx] > arreglo[j]) { // Compara si el elemento actual es menor que el mínimo.
                    maxIdx = j; // Actualiza el índice del elemento mínimo.
                }
            }
            if (maxIdx != i) { // Si el índice del mínimo no es el actual, realiza el intercambio.
                int aux = arreglo[maxIdx]; // Guarda el valor del elemento mínimo en una variable auxiliar.
                arreglo[maxIdx] = arreglo[i]; // Asigna el valor del elemento actual al índice del mínimo.
                arreglo[i] = aux; // Asigna el valor del mínimo al índice actual.
            }
        }
    }

}

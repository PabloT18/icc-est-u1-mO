package controllers;

import views.ViewConsole;

/**
 * Clase que implementa el método de ordenamiento por inserción.
 * 
 * Este algoritmo ordena un arreglo de enteros en orden ascendente utilizando el
 * método de inserción. El método cuenta el número de comparaciones realizadas
 * durante el proceso de ordenamiento.
 *
 * Complejidad:
 * - Peor caso: O(n^2), cuando el arreglo está ordenado en orden descendente.
 * - Mejor caso: O(n), cuando el arreglo ya está ordenado.
 */
public class MetodoInsercion {

    private ViewConsole viewConsole;

    /**
     * Constructor de la clase MetodoInsercion.
     * 
     * @param viewConsole La vista de consola utilizada para mostrar información.
     */
    public MetodoInsercion(ViewConsole viewConsole) {
        this.viewConsole = viewConsole;
    }

    /**
     * Ordena un arreglo de enteros en orden ascendente utilizando el método de
     * inserción.
     *
     * @param arreglo El arreglo de enteros a ordenar.
     * @param pasos   Si es true, imprime en consola los pasos intermedios del
     *                proceso de ordenamiento.
     * @return El número de comparaciones realizadas durante el proceso de
     *         ordenamiento.
     *
     *         El método implementa el algoritmo de ordenamiento por inserción, que
     *         consiste en dividir el arreglo
     *         en una parte ordenada y otra desordenada. En cada iteración, se toma
     *         un elemento de la parte desordenada
     *         y se inserta en la posición correcta dentro de la parte ordenada.
     *
     *         Si el parámetro `pasos` es true, se imprimen mensajes en consola que
     *         describen cada paso del algoritmo,
     *         incluyendo comparaciones, movimientos de elementos y el estado actual
     *         del arreglo.
     *
     *         Complejidad:
     *         - Peor caso: O(n^2), cuando el arreglo está ordenado en orden
     *         descendente.
     *         - Mejor caso: O(n), cuando el arreglo ya está ordenado.
     */
    public int ordenarAsd(int[] arreglo, boolean pasos) {
        int tam = arreglo.length; // Obtiene el tamaño del arreglo.
        int contComparaciones = 0; // Inicializa el contador de comparaciones en 0.

        // Recorre el arreglo desde el segundo elemento hasta el final.
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i]; // Toma el elemento actual como auxiliar.
            int j = i - 1; // Inicializa el índice para comparar con los elementos anteriores.

            // Si se solicita, imprime información sobre el estado actual del proceso.
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }

            // Compara el elemento auxiliar con los elementos anteriores y los desplaza si
            // es necesario.
            while (j >= 0 && aux < arreglo[j]) {
                contComparaciones++; // Incrementa el contador de comparaciones.

                // Si se solicita, imprime información sobre la comparación actual.
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);

                arreglo[j + 1] = arreglo[j]; // Desplaza el elemento hacia la derecha.

                // Si se solicita, imprime el estado actual del arreglo después del movimiento.
                if (pasos)
                    viewConsole.imprimirArreglo(arreglo);

                j = j - 1; // Decrementa el índice para continuar comparando con elementos anteriores.

                // Si se solicita, imprime información sobre el movimiento realizado.
                if (pasos)
                    System.out.println("Mueve arreglo[" + (j + 1) + "] a arreglo[" + (j + 2) + "]");
            }

            arreglo[j + 1] = aux; // Inserta el elemento auxiliar en su posición correcta.

            // Si se solicita, imprime información sobre la inserción realizada.
            if (pasos)
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));

            // Si se solicita, imprime el estado actual del arreglo después de la inserción.
            if (pasos)
                System.out.print("Estado actual");

            if (pasos)
                viewConsole.imprimirArreglo(arreglo);
        }

        return contComparaciones; // Devuelve el número total de comparaciones realizadas.
    }

}
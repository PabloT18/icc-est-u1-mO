package views;

/**
 * Clase ViewConsole que proporciona métodos para imprimir arreglos en la
 * consola.
 * Esta clase incluye métodos sobrecargados para imprimir arreglos de enteros y
 * cadenas.
 */
public class ViewConsole {

    /**
     * Imprime un arreglo de enteros en la consola.
     * Cada elemento del arreglo se imprime seguido de un guion y un espacio (" -
     * ").
     * Al final, se imprime un salto de línea.
     *
     * @param arreglo El arreglo de enteros a imprimir.
     */
    public void imprimirArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

    /**
     * Imprime un arreglo de cadenas en la consola.
     * Cada elemento del arreglo se imprime seguido de un guion y un espacio (" -
     * ").
     * Al final, se imprime un salto de línea.
     *
     * @param arreglo El arreglo de cadenas a imprimir.
     */
    public void imprimirArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }

}

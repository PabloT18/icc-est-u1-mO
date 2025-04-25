import java.util.Scanner;

import controllers.MetodoBurbuja;
import controllers.MetodoBurbujaMejorado;
import controllers.MetodoInsercion;
import controllers.MetodoSeleccion;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {

        /// instancia de vistas
        ViewConsole viewConsole = new ViewConsole();

        // INSTANTANCIAS de metoocs
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion(viewConsole);
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Arreglo inicial a ordenar
            int[] arreglo = { 10, 9, 21, 5, 15, 2, -1, 0 };

            // Mostrar opciones de métodos de ordenamiento
            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");

            // Solicitar al usuario que seleccione un método de ordenamiento
            int metodo = getPositve(scanner, "\tIngrese la opción");

            // Verificar si el usuario desea salir
            if (metodo == 5) {
                System.out.println("Adios");
                continuar = false; // Finalizar el bucle
                break;
            }

            // Preguntar si el usuario desea ver los pasos del ordenamiento
            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean conPasos = scanner.nextBoolean();

            // Solicitar al usuario el orden de ordenamiento (ascendente o descendente)
            String[] posibles = { "A", "D" };
            String orden = getValidString(scanner, posibles,
                    "¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            boolean ascendente = orden.equalsIgnoreCase("A");

            int contComparaciones; // Variable para contar comparaciones
            int[] resultados; // Arreglo para almacenar resultados adicionales
            switch (metodo) {
                case 1:
                    // Método de ordenamiento Burbuja
                    System.out.println("Metodo Burbuja");
                    System.out.print("Arreglo original->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo original
                    metodoBurbujaClase.ordenar(arreglo, ascendente); // Ordenar el arreglo
                    System.out.print("Arreglo ordenado->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo ordenado
                    break;
                case 2:
                    // Método de ordenamiento Selección
                    System.out.println("Metodo Selección");
                    System.out.print("Arreglo original->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo original
                    mS.ordenar(arreglo, ascendente); // Ordenar el arreglo
                    System.out.print("Arreglo ordenado->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo ordenado
                    break;
                case 3:
                    // Método de ordenamiento Inserción
                    contComparaciones = 0;
                    System.out.println("Metodo Inserción");
                    System.out.print("Arreglo original->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo original
                    contComparaciones = mI.ordenarAsd(arreglo, conPasos); // Ordenar el arreglo y contar comparaciones
                    System.out.print("Arreglo ordenado->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo ordenado
                    System.out.println("Comparaciones ->" + contComparaciones); // Mostrar número de comparaciones
                    break;
                case 4:
                    // Método de ordenamiento Burbuja Mejorado
                    System.out.println("Metodo Burbuja Mejorado");
                    System.out.print("Arreglo original->");
                    contComparaciones = 0;
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo original
                    resultados = mBM.ordenarAscendente(arreglo); // Ordenar el arreglo y obtener resultados
                    System.out.print("Arreglo ordenado->");
                    viewConsole.imprimirArreglo(arreglo); // Imprimir arreglo ordenado
                    System.out.println("Comparaciones ->" + resultados[0]); // Mostrar número de comparaciones
                    System.out.println("Cambios ->" + resultados[1]); // Mostrar número de cambios
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }

    }

    /**
     * Método para obtener un número entero positivo del usuario.
     * 
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @param message El mensaje a mostrar al usuario para solicitar la entrada.
     * @return El número entero positivo ingresado por el usuario.
     */
    public static int getPositve(Scanner scanner, String message) {
        int number; // Variable para almacenar el número ingresado por el usuario.
        do {
            System.out.print(message + ": "); // Muestra el mensaje al usuario.
            number = scanner.nextInt(); // Lee un número entero ingresado por el usuario.
            if (number <= 0) { // Verifica si el número es menor o igual a 0.
                System.out.println("El número debe ser positivo. Intente nuevamente."); // Mensaje de error si el número
                                                                                        // no es positivo.
            }
        } while (number <= 0); // Repite el proceso mientras el número no sea positivo.
        return number; // Devuelve el número positivo ingresado.
    }

    /**
     * Método para obtener una cadena de texto válida de un conjunto de opciones
     * posibles.
     * 
     * @param scanner  El objeto Scanner para leer la entrada del usuario.
     * @param posibles Un arreglo de cadenas que contiene las opciones válidas.
     * @param message  El mensaje a mostrar al usuario para solicitar la entrada.
     * @return La cadena de texto ingresada por el usuario que coincide con una de
     *         las
     *         opciones válidas.
     */
    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido; // Variable para verificar si la entrada es válida.
        do {
            System.out.print(message + ": "); // Muestra el mensaje al usuario.
            input = scanner.next(); // Lee la entrada del usuario.
            valido = false; // Inicializa la validez como falsa.
            for (String posible : posibles) { // Recorre las opciones válidas.
                if (input.equalsIgnoreCase(posible)) { // Compara la entrada con las opciones válidas (ignorando
                                                       // mayúsculas/minúsculas).
                    valido = true; // Marca como válida si coincide.
                    break; // Sale del bucle si encuentra una coincidencia.
                }
            }
        } while (!valido); // Repite mientras la entrada no sea válida.
        return input; // Devuelve la entrada válida.
    }
}
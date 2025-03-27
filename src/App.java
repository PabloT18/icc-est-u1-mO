import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // int[] arreglo = { 10, 9, 21, 5, 15, 2, -1, 0 };

        // INSTANTANCIAS
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            int[] arreglo = { 10, 9, 21, 5, 15, 2, -1, 0 };

            // int[] arreglo = new int[1000];
            // for (int i = 0; i < arreglo.length; i++) {
            // arreglo[i] = (int) (Math.random() * 100000) + 1;

            // }

            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");

            System.out.println("5. Salir");
            // int metodo = scanner.nextInt();
            int metodo = getPositve(scanner, "\tIngrese la opción");

            if (metodo == 5) {
                System.out.println("Adios");
                continuar = false;
                break;
            }

            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean conPasos = scanner.nextBoolean();

            // System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente
            // (D)?:");
            // String orden2 = scanner.next();
            // boolean ascendente = orden2.equalsIgnoreCase("A");
            String[] posibles = { "A", "D" };
            String orden = getValidString(scanner, posibles,
                    "¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            boolean ascendente = orden.equalsIgnoreCase("A");

            int contComparaciones;
            int[] resultados;
            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    break;
                case 2:
                    System.out.println("Metodo Selección");
                    break;
                case 3:
                    contComparaciones = 0;
                    System.out.println("Metodo Inserción");
                    System.out.print("Arreglo original->");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    contComparaciones = mI.ordenarAsd(arreglo, conPasos);
                    System.out.print("Arreglo ordenado->");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones ->" + contComparaciones);
                    break;
                case 4:
                    System.out.println("Metodo Burbuja Mejorado");
                    System.out.print("Arreglo original->");
                    contComparaciones = 0;
                    mBM.imprimirArreglo(arreglo);
                    resultados = mBM.ordenarAscendente(arreglo);
                    System.out.print("Arreglo ordenado->");
                    mBM.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones ->" + resultados[0]);
                    System.out.println("Cambios ->" + resultados[1]);

                    break;

                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }

    }

    public static int getPositve(Scanner scanner, String message) {
        int number;
        do {
            System.out.print(message + ": ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
        } while (number <= 0);
        return number;
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do {
            System.out.print(message + ": ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }

        } while (!valido);
        return input;
    }
}
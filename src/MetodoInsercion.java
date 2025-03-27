public class MetodoInsercion {

    public int ordenarAsd(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && aux < arreglo[j]) {
                contComparaciones++;
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);
                arreglo[j + 1] = arreglo[j];
                if (pasos)
                    imprimirArreglo(arreglo);

                j = j - 1;
                if (pasos)

                    System.out.println("Mueve arreglo[" + (j + 1) + "] a arreglo[" + (j + 2) + "]");

            }
            arreglo[j + 1] = aux;
            if (pasos)
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));

            if (pasos)
                System.out.print("Estado actual");

            if (pasos)
                imprimirArreglo(arreglo);

        }
        return contComparaciones;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + " - ");

        }

        System.out.println();

    }

}
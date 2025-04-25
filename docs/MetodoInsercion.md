# Método de Ordenamiento por Inserción

El método de ordenamiento por inserción es un algoritmo sencillo y eficiente para pequeños conjuntos de datos o arreglos parcialmente ordenados. Su principio básico consiste en ir tomando elementos del arreglo y colocándolos en la posición adecuada respecto a los elementos ya ordenados.

## Complejidad del algoritmo:

- **Peor caso:** O(n²), ocurre cuando el arreglo está en orden inverso.
- **Mejor caso:** O(n), cuando el arreglo ya está ordenado.

## Explicación del Código

### Constructor

El constructor recibe una instancia de `ViewConsole` que permite imprimir pasos intermedios del proceso:

```java
public MetodoInsercion(ViewConsole viewConsole) {
    this.viewConsole = viewConsole;
}
```

### Método `ordenarAsd`

Este método ordena un arreglo en orden ascendente utilizando inserción, con una opción para imprimir cada paso del proceso:

```java
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
                viewConsole.imprimirArreglo(arreglo);

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
            viewConsole.imprimirArreglo(arreglo);
    }

    return contComparaciones;
}
```

### Detalle de funcionamiento:
- El arreglo se divide lógicamente en dos partes: una ordenada y otra desordenada.
- Se toma el primer elemento de la parte desordenada y se inserta en la posición correcta dentro de la parte ordenada.
- Si la opción `pasos` es verdadera, se imprimen detalles del proceso en cada iteración, como comparaciones, movimientos y el estado actual del arreglo.

## Ejemplo de Uso

```java
ViewConsole vista = new ViewConsole();
MetodoInsercion insercion = new MetodoInsercion(vista);

int[] numeros = {4, 3, 5, 1, 2};
insercion.ordenarAsd(numeros, true);
// Resultado ordenado: {1, 2, 3, 4, 5}
```

Este método es ideal para fines educativos debido a su claridad conceptual y facilidad para mostrar el proceso paso a paso.


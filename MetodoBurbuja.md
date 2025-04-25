# Método de Ordenamiento por Burbuja Mejorado

El método de ordenamiento por burbuja mejorado es una variación del algoritmo clásico de burbuja. Este método funciona comparando cada par de elementos adyacentes e intercambiándolos si están en el orden incorrecto. La mejora consiste en optimizar ligeramente las comparaciones, aunque en este caso específico presentado, aún tiene un rendimiento promedio de O(n²).

## Complejidad del algoritmo:

- **Peor caso:** O(n²) (cuando los elementos están en orden inverso al requerido).
- **Mejor caso:** O(n) (cuando el arreglo ya está ordenado).

## Explicación del Código

### 1. Ordenamiento Ascendente

El método `ordenarAsendente` ordena un arreglo en orden ascendente.

```java
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
```

### Detalle de funcionamiento:
- Se recorren todos los elementos con dos ciclos anidados.
- Se compara cada elemento con todos los siguientes.
- Si el elemento actual es mayor que uno posterior, se intercambian.

### 2. Ordenamiento Ascendente o Descendente (según parámetro)

El método `ordenar` permite ordenar un arreglo tanto de manera ascendente como descendente, según un parámetro booleano (`isDes`).

```java
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
```

### Detalle de funcionamiento:
- El parámetro `isDes` define si el orden será ascendente o descendente.
- La lógica de intercambio se ajusta según el tipo de orden seleccionado.
- Si `isDes` es `true`, el arreglo se ordena de mayor a menor (descendente).
- Si `isDes` es `false`, el arreglo se ordena de menor a mayor (ascendente).

## Ejemplo de Uso

```java
MetodoBurbuja burbuja = new MetodoBurbuja();

int[] numeros = {5, 3, 8, 4, 2};
burbuja.ordenarAsendente(numeros);
// Resultado: {2, 3, 4, 5, 8}

burbuja.ordenar(numeros, true);
// Resultado: {8, 5, 4, 3, 2}
```

Este método es sencillo y útil para comprender la lógica básica del ordenamiento, aunque no es eficiente para arreglos muy grandes.


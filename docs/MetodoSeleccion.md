# Método de Ordenamiento por Selección

El método de ordenamiento por selección consiste en buscar el elemento mínimo o máximo del arreglo y colocarlo en la posición inicial. Luego, repite este proceso para el resto del arreglo hasta que quede completamente ordenado.

## Complejidad del algoritmo:

- **Peor caso:** O(n²)
- **Mejor caso:** O(n²)

La complejidad es siempre O(n²), independientemente del estado inicial del arreglo.

## Explicación del Código

### Método `ordenar`

Este método permite ordenar un arreglo tanto en orden ascendente como descendente según un parámetro booleano (`isDes`).

```java
public void ordenar(int[] arreglo, boolean isDes) {
    if (isDes) {
        ordenarDesSelecccion(arreglo);
    } else {
        ordenarAsdSelececion(arreglo);
    }
}
```

### 1. Ordenamiento Descendente

El método `ordenarDesSelecccion` ordena los elementos del arreglo en orden descendente:

```java
public void ordenarDesSelecccion(int[] arreglo) {
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arreglo[maxIdx] < arreglo[j]) {
                maxIdx = j;
            }
        }
        if (maxIdx != i) {
            int aux = arreglo[maxIdx];
            arreglo[maxIdx] = arreglo[i];
            arreglo[i] = aux;
        }
    }
}
```

### 2. Ordenamiento Ascendente

El método `ordenarAsdSelececion` ordena los elementos del arreglo en orden ascendente:

```java
public void ordenarAsdSelececion(int[] arreglo) {
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arreglo[maxIdx] > arreglo[j]) {
                maxIdx = j;
            }
        }
        if (maxIdx != i) {
            int aux = arreglo[maxIdx];
            arreglo[maxIdx] = arreglo[i];
            arreglo[i] = aux;
        }
    }
}
```

### Detalle del funcionamiento:
- Se selecciona el índice del primer elemento como el mínimo (o máximo).
- Se compara este elemento con todos los restantes.
- Si se encuentra un elemento menor (ascendente) o mayor (descendente), se actualiza el índice.
- Al finalizar cada iteración, se intercambia el elemento actual con el encontrado.

## Ejemplo de Uso

```java
MetodoSeleccion seleccion = new MetodoSeleccion();

int[] numeros = {9, 1, 4, 6, 2};
seleccion.ordenar(numeros, false);
// Resultado ordenado ascendente: {1, 2, 4, 6, 9}

seleccion.ordenar(numeros, true);
// Resultado ordenado descendente: {9, 6, 4, 2, 1}
```

Este método es útil para entender claramente la lógica de selección y colocación de elementos, aunque no es eficiente para grandes conjuntos de datos.


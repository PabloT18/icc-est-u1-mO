# Método de Ordenamiento por Burbuja Mejorado

El método de ordenamiento por burbuja mejorado es una optimización del algoritmo clásico de burbuja. Esta mejora permite identificar si el arreglo ya está ordenado, evitando iteraciones adicionales y reduciendo considerablemente la cantidad de comparaciones necesarias para ordenar un arreglo ya ordenado o parcialmente ordenado.

## Complejidad del algoritmo:

- **Peor caso:** O(n²), ocurre cuando el arreglo está completamente en orden inverso.
- **Mejor caso:** O(n), cuando el arreglo ya está ordenado.

## Explicación Detallada del Código

### Método `ordenarAscendente`

Este método ordena un arreglo en orden ascendente y devuelve estadísticas detalladas sobre el proceso, incluyendo el número de comparaciones e intercambios realizados:

```java
public int[] ordenarAscendente(int[] arreglo) {
    int n = arreglo.length;
    int contComparaciones = 0;
    int contCambios = 0;
    boolean intercambio;

    for (int i = 0; i < n - 1; i++) {
        intercambio = false;
        for (int j = 0; j < n - i - 1; j++) {
            contComparaciones++;
            if (arreglo[j] > arreglo[j + 1]) {
                contCambios++;
                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
                intercambio = true;
            }
        }
        // Si no hubo intercambios en una iteración completa, el arreglo ya está ordenado.
        if (!intercambio) {
            break;
        }
    }

    return new int[]{contComparaciones, contCambios};
}
```

### Detalle del funcionamiento:
- Se emplean dos ciclos anidados para comparar elementos adyacentes.
- Se compara cada elemento con su sucesor inmediato.
- Si el elemento actual es mayor que el siguiente, se realiza un intercambio y se registra el cambio.
- Se introduce una bandera (`intercambio`) para detectar si se realizó algún cambio durante la iteración actual.
- Si después de recorrer todo el arreglo en una iteración no se realiza ningún intercambio, significa que el arreglo está ordenado y el algoritmo termina anticipadamente.

## Ventajas del método mejorado:
- Reducción significativa en tiempo de ejecución para arreglos parcialmente ordenados.
- Menos iteraciones innecesarias comparado con el algoritmo clásico de burbuja.
- Ideal para situaciones donde se sospecha que el arreglo puede estar total o parcialmente ordenado.

## Ejemplo de Uso

```java
MetodoBurbujaMejorado burbujaMejorada = new MetodoBurbujaMejorado();

int[] numeros = {3, 7, 2, 5, 1};
int[] resultados = burbujaMejorada.ordenarAscendente(numeros);

// Resultado ordenado: {1, 2, 3, 5, 7}
// Comparaciones realizadas: resultados[0], Cambios realizados: resultados[1]
```

Este método permite entender claramente la mejora del rendimiento y optimización sobre el algoritmo clásico, proporcionando métricas claras sobre el desempeño del proceso.


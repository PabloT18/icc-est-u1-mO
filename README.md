# Métodos de Ordenamiento

## Getting Started

Este repositorio corresponde a la primera unidad de la asignatura **Estructura de Datos**, donde se implementan y comparan diferentes algoritmos de ordenamiento.

---

## Requirements

- **Java JDK 11** o superior.
- **Git 2.20** o superior.

---

## Definición de Métodos de Ordenamiento

Un algoritmo de ordenamiento organiza los elementos de un arreglo o lista en un orden específico (ascendente o descendente). Este proyecto incluye las siguientes implementaciones:

### Métodos Implementados

1. **Burbuja:** Compara y cambia elementos adyacentes repetidamente hasta que el arreglo esté ordenado.
2. **Selección:** Encuentra el elemento mínimo/máximo y lo coloca en su posición correcta.
3. **Inserción:** Inserta elementos en su posición correcta dentro de un subarreglo ordenado.
4. **Burbuja Mejorado:** Optimización del método burbuja para reducir comparaciones innecesarias.

---

## Comparación entre Métodos de Ordenamiento

| **Método**            | **Complejidad Promedio** | **Complejidad Peor Caso** | **Estabilidad** | **Uso Recomendado**                                                                 |
|------------------------|--------------------------|----------------------------|-----------------|-------------------------------------------------------------------------------------|
| **Burbuja**           | O(n²)                   | O(n²)                     | Sí              | Para aprendizaje o arreglos pequeños.                                              |
| **Selección**         | O(n²)                   | O(n²)                     | No              | Cuando se desea minimizar el número de intercambios.                               |
| **Inserción**         | O(n²)                   | O(n²)                     | Sí              | Eficiente para arreglos casi ordenados o pequeños.                                 |
| **Burbuja Mejorado**  | O(n²)                   | O(n²)                     | Sí              | Similar al burbuja, pero con optimización para arreglos parcialmente ordenados.    |

---

## Ejemplos de Implementación

### Ejemplo con Método Burbuja
```java
import controllers.MetodoBurbuja;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        metodoBurbuja.ordenar(arreglo, true); // Orden ascendente
        metodoBurbuja.imprimirArreglo(arreglo);
    }
}

```
Ejemplo con Método Selección
```java
import controllers.MetodoSeleccion;
import views.ViewConsole;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        metodoSeleccion.ordenar(arreglo, false); // Orden descendente
        ViewConsole viewConsole = new ViewConsole();
        viewConsole.imprimirArreglo(arreglo);
    }
}
```

Ejemplo con Método Inserción
```java
import controllers.MetodoInsercion;
import views.ViewConsole;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
        MetodoInsercion metodoInsercion = new MetodoInsercion(new ViewConsole());
        int comparaciones = metodoInsercion.ordenarAsd(arreglo, true); // Con pasos intermedios
        System.out.println("Comparaciones realizadas: " + comparaciones);
    }
}
```
Ejemplo con Método Burbuja Mejorado
```java
import controllers.MetodoBurbujaMejorado;
import views.ViewConsole;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
        MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();
        int[] resultados = metodoBurbujaMejorado.ordenarAscendente(arreglo);
        System.out.println("Comparaciones: " + resultados[0] + ", Cambios: " + resultados[1]);
    }
}
```

## Conclusión
Este proyecto permite explorar y comparar diferentes algoritmos de ordenamiento, proporcionando una base sólida para entender sus características, ventajas y desventajas. Es ideal para estudiantes que desean profundizar en el tema de estructuras de datos y algoritmos.
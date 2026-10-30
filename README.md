# Fundamentos de Programación en Java

Actividad práctica de Fundamentos de Programación en Java.
Universidad San Buenaventura.

## Integrantes

| Integrante | Ejercicio | Archivo | Rama |
|---|---|---|---|
| Andres Martinez | Ejercicio 1. Variables y operadores | `Ejercicio1.java` | `Ejercicio1` |
| Andres Cardozo | Ejercicio 2. Estructuras condicionales | `Ejercicio2.java` | `Ejercicio2` |
| Andres Quintero | Ejercicio 3. Métodos | `Ejercicio3.java` | `Ejercicio3` |
| Sebastian Rodriguez | Ejercicio 5. Integrador | `Ejercicio4.java` | `Ejercicio4` |

## Objetivos

- Aplicar conceptos de programación imperativa mediante algoritmos en Java.
- Utilizar variables, operadores, estructuras condicionales y ciclos.
- Analizar problemas sencillos y proponer soluciones computacionales.

## Ejercicio 1. Variables y operadores

**¿Qué es una variable en Java?**
Un espacio en memoria con un nombre y un tipo de dato, donde se guarda un valor que puede cambiar durante la ejecución.

**¿Diferencia entre `int`, `double` y `String`?**
- `int`: números enteros (`5`, `-3`).
- `double`: números decimales (`4.5`).
- `String`: cadenas de texto (`"Hola"`). Es una clase, no un tipo primitivo.

**¿Para qué sirven los operadores aritméticos?**
Para realizar cálculos matemáticos: `+`, `-`, `*`, `/` y `%` (residuo).

**Práctica:** solicita el nombre del estudiante y tres notas, calcula el promedio y lo muestra en pantalla.

## Ejercicio 2. Estructuras condicionales

**¿Qué función cumple `if-else`?**
Evalúa una condición booleana: si es verdadera ejecuta un bloque, y si no, ejecuta otro. Permite que el programa tome decisiones.

**¿Cuándo es recomendable usar una estructura condicional?**
Cuando el programa debe comportarse distinto según una condición: validar datos, clasificar valores o elegir entre caminos.

**Práctica:** solicita la edad y determina si es menor de edad, mayor de edad o adulto mayor (65 años o más).

## Ejercicio 3. Métodos o funciones

**¿Qué es un método en Java?**
Un bloque de código con nombre que realiza una tarea específica, puede recibir parámetros y devolver un valor.

**¿Qué ventajas tiene dividir un programa en métodos?**
- Reutilización de código.
- Mayor orden y legibilidad.
- Más facilidad para probar y corregir errores.
- Mejor mantenimiento y trabajo en equipo.

**Práctica:** el método `public static int cuadrado(int numero)` recibe un número y devuelve su cuadrado.

## Ejercicio 5. Integrador

**¿Por qué Java es orientado a objetos?**
Porque organiza el programa en clases y objetos que combinan datos (atributos) y comportamiento (métodos), y aplica los pilares de la POO: encapsulamiento, herencia, polimorfismo y abstracción.

**¿Qué ventajas ofrece Java para el desarrollo de software?**
- Multiplataforma gracias a la JVM.
- Robusto: tipado fuerte, manejo de excepciones y recolector de basura.
- Gran ecosistema de librerías y frameworks.
- Amplia comunidad y documentación.
- Muy usado en la industria (empresarial, Android, backend).

**Práctica:** registra el nombre y tres notas, calcula el promedio y determina si aprueba (promedio ≥ 3.0) o reprueba (promedio < 3.0).

## Cómo ejecutar

```bash
javac Ejercicio1.java
java Ejercicio1
```

Se repite con cada archivo.

## Flujo de trabajo en Git

Cada integrante trabajó su ejercicio en una rama independiente y luego hizo merge a `main` mediante Pull Request.

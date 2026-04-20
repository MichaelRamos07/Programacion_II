# Proyectos de Programación II 🚀

Este repositorio contiene ejercicios prácticos desarrollados en Java, enfocados en lógica de programación, estructuras de control (bucles anidados) e integración de clases.

## 📋 Contenido del Proyecto

El proyecto se divide en tres componentes principales que trabajan en conjunto:

1. **App.java**: La clase principal (punto de entrada) que coordina la ejecución de los demás programas.

2. **secSigno.java**: Genera una secuencia alterna de signos `+` y `-` basada en una cantidad ingresada por el usuario.

3. **MConSignos.java**: Dibuja una letra **M** usando "+". Incluye una lógica especial para manejar números pares e impares, asegurando que el pico central no se cruce de forma incorrecta.

```java
    import java.util.Scanner;
public class MConSignos {
    public static void LaM(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño de la letra M que desea imprimir: ");
            int tam = sc.nextInt();
                for (int i = 0; i < tam; i++) {
                    System.out.print("* ");
                        for (int j = 0; j < tam; j++) {
                            if (i <= ((tam-1)/2)) {
                                if (i == j || i + j == tam - 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }else {
                                System.out.print("  ");
                            }
                        }

                    System.out.println("* ");
                }
            sc.close();
        }
    }
}

```

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 26)
* **Editor:** Visual Studio Code
* **Fuente:** Cascadia Code NF (para una mejor visualización de símbolos)
* **Control de Versiones:** Git & GitHub

## Ejemplo de ejecución

javac App.java
java App

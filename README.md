# Calculadora en Java con Layout XML

Esta es una aplicación Android simple que permite al usuario realizar la suma de dos números. La interfaz gráfica se ha implementado utilizando un archivo de diseño XML, y la lógica de la aplicación está escrita en Java.

## Características

- **Interfaz gráfica**: Utiliza componentes estándar de Android como `EditText`, `Button` y `TextView`.
- **Funcionalidad**: Permite al usuario ingresar dos números, calcular su suma y mostrar el resultado en pantalla.
- **Manejo de errores**: La aplicación maneja errores de entrada, como campos vacíos o valores no numéricos.

## Capturas de Pantalla

![Interfaz Calculadora](![image](https://github.com/user-attachments/assets/92dcc066-55f3-44db-aa40-281418e30777))
![Error primer input](![image](https://github.com/user-attachments/assets/2b2a8d0d-f10d-4b1e-b303-5b2f68e2c4a2))
![Error segundo input](![image](https://github.com/user-attachments/assets/f2867c45-ad9f-4074-b314-4387f7899a45))
![Error punto del decimal](![image](https://github.com/user-attachments/assets/0bf4482e-f50b-4b88-b655-d81a20b2198f))

**Solo permite numeros, y un maximo de un . y un - solo al principio**

![Ejemplo de resultado sin decimales](![image](https://github.com/user-attachments/assets/9748e5c4-92ab-411e-a932-198193016b06))
![Ejemplo de resultado con 2 decimales](![image](https://github.com/user-attachments/assets/96150e72-3214-47b8-af1a-97fba482f24f)
)
![Ejemplo de resultado con 5 decimales](![image](https://github.com/user-attachments/assets/0842bc98-085e-4a0d-ad5d-078b02dba54a)
)

## Instrucciones de Compilación

1. Clona este repositorio en tu máquina local.
   ```bash
   git clone https://github.com/GiovanniJMDev/JavaCalculator.git
   ```
   
2. Abre el proyecto en Android Studio.

3. Conecta un dispositivo Android o inicia un emulador.

4. Haz clic en el botón "Run" para compilar y ejecutar la aplicación.

5. Estructura del Proyecto
   5.1. app/src/main/java/com/example/calculadora/MainActivity.java: Contiene la lógica de la aplicación.
   5.2. app/src/main/res/layout/activity_main.xml: Define la interfaz gráfica de la aplicación.

# Calculadora en Java con Layout XML

Esta es una aplicación Android simple que permite al usuario realizar la suma de dos números. La interfaz gráfica se ha implementado utilizando un archivo de diseño XML, y la lógica de la aplicación está escrita en Java.

## Características

- **Interfaz gráfica**: Utiliza componentes estándar de Android como `EditText`, `Button` y `TextView`.
- **Funcionalidad**: Permite al usuario ingresar dos números, calcular su suma y mostrar el resultado en pantalla.
- **Manejo de errores**: La aplicación maneja errores de entrada, como campos vacíos o valores no numéricos.

## Capturas de Pantalla

<p align="center">
  <img src="https://github.com/user-attachments/assets/2b2a8d0d-f10d-4b1e-b303-5b2f68e2c4a2" alt="Error primer input" style="height: 300px; width: auto;" />
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/f2867c45-ad9f-4074-b314-4387f7899a45" alt="Error segundo input" style="height: 300px; width: auto;" />
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/0bf4482e-f50b-4b88-b655-d81a20b2198f" alt="Error punto del decimal" style="height: 300px; width: auto;" />
</p>

<p>
  <strong>Solo permite números, y un máximo de un <code>.</code> y un <code>-</code> solo al principio.</strong>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/9748e5c4-92ab-411e-a932-198193016b06" alt="Ejemplo de resultado sin decimales" style="height: 300px; width: auto;" />
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/96150e72-3214-47b8-af1a-97fba482f24f" alt="Ejemplo de resultado con 2 decimales" style="height: 300px; width: auto;" />
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/0bf8fe5f-4ae9-4273-81c5-b7e726d4a291" alt="Ejemplo de resultado con 5 decimales" style="height: 300px; width: auto;" />
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/2c4e9119-ddff-4058-8d80-3be335ad03e7" alt="Ejemplo de resultado de suma de un negativo" style="height: 300px; width: auto;" />
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/a387c55f-a0fd-4ee0-9508-94b59a7e4acb" alt="Ejemplo de resultado de suma de dos negativo" style="height: 300px; width: auto;" />
</p>



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

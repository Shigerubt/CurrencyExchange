

# CurrencyExchange

**CurrencyExchange** es una aplicación Java que permite calcular el valor equivalente entre diferentes divisas. El proyecto ha sido desarrollado en IntelliJ IDEA y utiliza buenas prácticas de programación orientada a objetos.

## Características

- Conversión entre múltiples divisas internacionales
- Interfaz amigable desde consola (puedes adaptar si tienes GUI)
- Tasas de cambio configurables o obtenidas desde un API externo
- Validación de entrada de usuario
- Fácil de extender para agregar más monedas

## Requisitos

- **Java 11** o superior  
- **IntelliJ IDEA** (recomendado para desarrollo)

## Instalación y Ejecución

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/Shigerubt/CurrencyExchange.git
   cd CurrencyExchange
   ```

2. **Importa el proyecto en IntelliJ IDEA:**
   - Abre IntelliJ IDEA.
   - Selecciona “Open” y elige la carpeta del proyecto.

3. **Compila y ejecuta:**
   - Ve al archivo principal (por ejemplo, `Main.java`).
   - Haz clic derecho y selecciona “Run 'Main'”.

## Uso

1. Al ejecutar el programa, sigue las instrucciones en consola para:
   - Ingresar la cantidad de dinero.
   - Seleccionar la moneda de origen y destino.
   - Ver el resultado de la conversión.

2. Ejemplo de uso:
   ```
   Introduce la cantidad: 100
   Selecciona moneda de origen: USD
   Selecciona moneda destino: EUR
   Resultado: 100 USD = 92 EUR
   ```

## Estructura del Proyecto

```
CurrencyExchange/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ... (código fuente)
│
├── .gitignore
└── README.md
```

## Personalización

- Puedes agregar más divisas modificando el archivo de tasas de cambio o el código fuente.
- Si deseas conectar con una API externa (como [exchangerate-api.com](https://www.exchangerate-api.com/)), consulta su documentación y utiliza librerías como `HttpURLConnection` o `OkHttp`.

## Contribuciones

¡Las contribuciones son bienvenidas! Abre un issue o un pull request para sugerencias y mejoras.

## Licencia

Este proyecto está licenciado bajo la [MIT License](LICENSE).



# Consumo de un web service con distintas tecnologías

En este repositorio se encuentra los proyectos de las tecnologías: 
- Java
- C# .NET
- Pyhton
Para consumir un servicio web de una calculadora, que cuenta con las operaciones básicas.

## Requisitos

### Para C#

- [Visual Studio 2022](https://visualstudio.microsoft.com/vs/)
- .NET SDK 6.0 o superior

### Para Python

- [Python 3.10](https://www.python.org/downloads/) o superior
- Un entorno virtual para Python (opcional pero recomendado)
- Librería `zeep` (para instalarla, consulta las instrucciones a continuación)

### Para Java

- [NetBeans IDE](https://netbeans.apache.org/download/index.html)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 8 o superior
- Configurar el `PATH` del sistema para incluir la carpeta `bin` del JDK

## Instrucciones

### Ejecutar el programa en C# usando Visual Studio 2022

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/usuario/nombre-del-proyecto.git
    cd nombre-del-proyecto/C#
    ```

2. **Abre el proyecto en Visual Studio 2022**:
    - Abre Visual Studio 2022.
    - Selecciona `Open a project or solution`.
    - Navega hasta el directorio `C#` dentro del repositorio clonado y selecciona el archivo de solución (`.sln`).

3. **Restaura los paquetes NuGet**:
    - Visual Studio debería restaurar automáticamente los paquetes NuGet al abrir el proyecto. Si no es así, haz clic derecho en la solución en el `Solution Explorer` y selecciona `Restore NuGet Packages`.

4. **Configura el proyecto de inicio** (si hay múltiples proyectos):
    - En el `Solution Explorer`, haz clic derecho en el proyecto que deseas ejecutar y selecciona `Set as StartUp Project`.

5. **Compila y ejecuta el proyecto**:
    - Presiona `Ctrl + F5` o selecciona `Debug > Start Without Debugging` para ejecutar el proyecto.

### Ejecutar el programa en Python

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/usuario/nombre-del-proyecto.git
    cd nombre-del-proyecto/python
    ```

2. **Crea y activa un entorno virtual** (opcional pero recomendado):
    ```bash
    python -m venv venv
    # En Windows
    .\venv\Scripts\activate
    # En macOS/Linux
    source venv/bin/activate
    ```

3. **Instala las dependencias**:
    ```bash
    pip install zeep
    ```

4. **Ejecuta el programa**:
    ```bash
    python distribuidas.py
    ```

### Ejecutar el web service de la calculadora en Java usando NetBeans

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/usuario/nombre-del-proyecto.git
    cd nombre-del-proyecto/calculadora
    ```

2. **Configura el `PATH` del sistema para incluir la carpeta `bin` del JDK**:
    - En Windows:
        - Abre el Panel de Control y selecciona `Sistema y Seguridad > Sistema > Configuración avanzada del sistema`.
        - Haz clic en `Variables de entorno` y selecciona `Path` en las variables del sistema.
        - Haz clic en `Editar` y añade la ruta a la carpeta `bin` del JDK (por ejemplo, `C:\Program Files\Java\jdk-14\bin`).

3. **Abre el proyecto en NetBeans**:
    - Abre NetBeans IDE.
    - Selecciona `File > Open Project`.
    - Navega hasta el directorio `calculadora` dentro del repositorio clonado y selecciona el proyecto.

4. **Ejecuta el proyecto**:
    - En el `Project Explorer`, navega hasta `calculatorClient` dentro del proyecto.
    - Haz clic derecho en `calculatorClient` y selecciona `Run`.

## Contribuciones

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a tu fork (`git push origin feature/nueva-funcionalidad`).
5. Crea un Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

  
   

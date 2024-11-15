# Patrones de Diseño en Java

Este repositorio está organizado como una guía de referencia para implementar patrones de diseño en Java. La estructura del proyecto permite consultar de manera rápida ejemplos prácticos de cada patrón, con comentarios detallados en el código que explican su funcionamiento. Es ideal para recordar conceptos y revisar implementaciones de patrones en diferentes situaciones de diseño.

## Patrones Implementados

1. **Abstract Factory**  
   Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.

2. **Adapter**  
   Convierte la interfaz de una clase en otra interfaz que el cliente espera.  
   - **Dependencias**: se incluyen las necesarias para trabajar con archivos CSV y Excel, ubicadas en la carpeta `resources/files`.
   - **Dependencias Maven**: Para el funcionamiento de este patrón, asegúrate de agregar las siguientes dependencias en el archivo `pom.xml`:

     ```xml
     <!-- Dependencia para manejo de archivos Excel -->
     <dependency>
         <groupId>org.apache.poi</groupId>
         <artifactId>poi</artifactId>
         <version>5.3.0</version>
     </dependency>
     
     <!-- Dependencia para manejo de archivos Excel en formato OOXML -->
     <dependency>
         <groupId>org.apache.poi</groupId>
         <artifactId>poi-ooxml</artifactId>
         <version>5.3.0</version>
     </dependency>
     
     <!-- Dependencias para manejo de logs con Log4j -->
     <dependency>
         <groupId>org.apache.logging.log4j</groupId>
         <artifactId>log4j-core</artifactId>
         <version>2.24.1</version>
     </dependency>
     <dependency>
         <groupId>org.apache.logging.log4j</groupId>
         <artifactId>log4j-api</artifactId>
         <version>2.24.1</version>
     </dependency>
     
     <!-- Dependencia para manejo de archivos CSV -->
     <dependency>
         <groupId>com.opencsv</groupId>
         <artifactId>opencsv</artifactId>
         <version>5.9</version>
     </dependency>
     ```

3. **Builder**  
   Separa la construcción de un objeto complejo de su representación, permitiendo la creación paso a paso.

4. **Composite**  
   Permite tratar objetos individuales y compuestos de manera uniforme.

5. **Decorator**  
   Añade responsabilidades adicionales a un objeto de manera dinámica y flexible.

6. **Factory Method**  
   Define una interfaz para crear un objeto, pero permite a las subclases decidir cuál clase instanciar.

7. **Inyección de Dependencias**  
   Facilita el uso de dependencias externas mediante la inversión de control.

8. **Observer**  
   Define una dependencia de uno a muchos entre objetos, de manera que cuando uno cambia, sus dependientes son notificados.

9. **Prototype**  
   Permite la creación de nuevos objetos clonando una instancia existente.

10. **Singleton**  
    Asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.

## Estructura del Proyecto

Cada patrón está implementado en un paquete específico que contiene su estructura de clases y explicaciones. Los comentarios en el código proporcionan detalles sobre la implementación y el propósito de cada patrón.

## Recursos Adicionales

En la carpeta `resources/files`, encontrarás:
- Un archivo CSV y un archivo Excel para probar la funcionalidad del patrón Adapter.

---

Este repositorio es una referencia para consulta y estudio personal sobre patrones de diseño en Java.

package adapter.adapter;

import adapter.model.Persona;

import java.io.InputStream;
import java.util.List;

public interface IInputFileReader {

    List<Persona> readFile(InputStream inputStream);
}

/*
EN ESTA INTERFAZ TENDREMOS METODO QUE DEVOLVERA LISTA DE LOS MODELOS DE PERSONA
Y COMO PARAMETRO, COMO SE QUIERE QUE SE LEA CUALQUIER TIPO DE ARCHIVO, Y SE QUIERE TRANSFORMAR EN UN LISTADO, SE COLOCA InputStream para convertir ese archivo a un listado de onjetos

CUALQUIERA PUEDE SER EL TIPO DE ARCHIVO, Y POR ENDE, ESTA INTERFAZ LA IMPLEMENTARAN TODOS LOS TIPOS DE ADAPTADORES
 */

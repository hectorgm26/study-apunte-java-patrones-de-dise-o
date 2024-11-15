package abstractfactory;

import abstractfactory.productos.Camisa;
import abstractfactory.productos.Pantalon;
import abstractfactory.productos.Zapato;

public interface RopasFactory {

    Zapato crearZapatos();

    Camisa crearCamisa();

    Pantalon crearPantalon();
}

/*
POR BUENA PRACTICA, AL NOMBRE DE LA INTEFAZ SE LE COLOCA EN EL NOMBRE, LA PALABRA DEL OBJETO QUE SE DESEA CREAR, SEGUIDO DE FACTORY


 */

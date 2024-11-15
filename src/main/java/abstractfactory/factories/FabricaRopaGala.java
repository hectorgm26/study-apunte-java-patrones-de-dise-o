package abstractfactory.factories;

import abstractfactory.RopasFactory;
import abstractfactory.productos.Camisa;
import abstractfactory.productos.Pantalon;
import abstractfactory.productos.Zapato;
import abstractfactory.productos.camisa.CamisaGala;
import abstractfactory.productos.pantalon.PantalonGala;
import abstractfactory.productos.zapato.ZapatoGala;

public class FabricaRopaGala implements RopasFactory {

    @Override
    public Zapato crearZapatos() {
        return new ZapatoGala();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaGala();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonGala();
    }
}

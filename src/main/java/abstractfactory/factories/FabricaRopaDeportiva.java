package abstractfactory.factories;

import abstractfactory.RopasFactory;
import abstractfactory.productos.Camisa;
import abstractfactory.productos.Pantalon;
import abstractfactory.productos.Zapato;
import abstractfactory.productos.camisa.CamisaDeportiva;
import abstractfactory.productos.pantalon.PantalonDeportivo;
import abstractfactory.productos.zapato.ZapatoDeportivo;

public class FabricaRopaDeportiva implements RopasFactory {

    @Override
    public Zapato crearZapatos() {
        return new ZapatoDeportivo();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaDeportiva();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonDeportivo();
    }
}

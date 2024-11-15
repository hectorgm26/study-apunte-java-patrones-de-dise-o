package abstractfactory.productos.zapato;

import abstractfactory.productos.Zapato;

public class ZapatoGala implements Zapato {

    @Override
    public boolean sonElegantes() {
        System.out.println("Zapato de gala -- son elegantes? --> SI");
        return true;
    }

    @Override
    public boolean sonParaCorrer() {
        System.out.println("Zapato de gala -- son aptos para correr? --> NO");
        return false;
    }
}

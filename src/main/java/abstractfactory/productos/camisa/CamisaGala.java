package abstractfactory.productos.camisa;

import abstractfactory.productos.Camisa;

public class CamisaGala implements Camisa {

    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa de Gala -- tiene mangas largas? --> SI");
        return true;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa de Gala -- tiene botones? --> SI");
        return true;
    }
}

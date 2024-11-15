package abstractfactory.productos.camisa;

import abstractfactory.productos.Camisa;

public class CamisaDeportiva implements Camisa {

    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa Deportiva -- tiene mangas largas? --> NO");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa Deportiva -- tiene botones? --> NO");
        return false;
    }
}

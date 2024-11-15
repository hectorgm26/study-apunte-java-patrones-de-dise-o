package abstractfactory.productos.zapato;

import abstractfactory.productos.Zapato;

public class ZapatoDeportivo implements Zapato {

    @Override
    public boolean sonElegantes() {
        System.out.println("Zapato Deportivo -- son elegantes? --> NO");
        return false;
    }

    @Override
    public boolean sonParaCorrer() {
        System.out.println("Zapato Deportivo -- son aptos para correr? --> SI");
        return true;
    }
}

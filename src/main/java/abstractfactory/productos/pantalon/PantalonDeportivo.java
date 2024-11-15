package abstractfactory.productos.pantalon;

import abstractfactory.productos.Pantalon;

public class PantalonDeportivo implements Pantalon {

    @Override
    public boolean tieneBolsillos() {
        System.out.println("Pantalon deportivo -- tiene bolsillos? --> NO");
        return false;
    }

    @Override
    public String tipoDeCierre() {
        System.out.println("Pantalon deportivo -- tiene cierre? --> Sin cierre");
        return null;
    }
}

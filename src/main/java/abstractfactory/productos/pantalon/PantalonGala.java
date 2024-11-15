package abstractfactory.productos.pantalon;

import abstractfactory.productos.Pantalon;

public class PantalonGala implements Pantalon {

    @Override
    public boolean tieneBolsillos() {
        System.out.println("Pantalon de gala -- tiene bolsillos? --> SI");
        return true;
    }

    @Override
    public String tipoDeCierre() {
        System.out.println("Pantalon de gala -- tiene cierre? --> CREMALLERA");
        return "Cremallera";
    }
}

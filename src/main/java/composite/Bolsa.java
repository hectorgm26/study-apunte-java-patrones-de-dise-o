package composite;

import java.util.ArrayList;

public class Bolsa extends BaseItem {

    // haremos que la bolsa no va a tener valor, va a valer 0, y lo que vale son los items que contiene
    public Bolsa(String nombre) {
        super(nombre, 0);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void remove(BaseItem baseItem) {
        items.remove(baseItem);
    }

    // AQUI IRA LA FUNCION RECURSIVA QUE SE LLAMARA A SI MISMA PARA IR SUMANDO LOS VALORES DE LOS ITEMS QUE CONTIENE
    // EL RESULTADO ES VALOR, RECORREMOS TODOS LOS ITEMS, Y EN CASO QUE QUE SEA UN ITEM EL VALUE. SE DEVUELVE EL VALOR
    @Override
    public int getValor() {

        int resultado = valor;
        for (BaseItem item : items)
            resultado = resultado + item.getValor();
        return resultado;
    }
}

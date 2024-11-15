package composite;

public class Item extends BaseItem {

    public Item(String nombre, int valor) {
        super(nombre, valor);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("No se pueden añadir elementos a un item");
    }

    @Override
    public void remove(BaseItem baseItem) {
        System.out.println("No se pueden eliminar elementos a un item");
    }

    @Override
    public int getValor() {
        return valor;
    }
}

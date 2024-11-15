package composite;

import java.util.List;

public abstract class BaseItem {

    // atributos protected para que las clases hijas hereden estos atributos
    protected String nombre;
    protected int valor; // aqui calcularemos el valor total del inventario de lo que lleve el player
    protected List<BaseItem> items; // aqui iran los hijos de la clase, es decir, un nodo con hojas, que serian los items. ya que un item contiene otros items

    public BaseItem(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract void add(BaseItem baseItem);

    public abstract void remove(BaseItem baseItem);

    public abstract int getValor();
}

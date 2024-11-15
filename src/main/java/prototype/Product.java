package prototype;

// se implementa la interfaz IPrototype, se refiere a que se clonara cualquier objeto que implemente la interfaz IPrototype
public class Product implements IPrototype {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        Product clone = new Product(this.name, this.price);
        return clone;
    }

    @Override
    public IPrototype deepClone() {  // AQUI NO APLICARIA LA CLONACION PROFUNDA, YA QUE LOS ATRIBUTOS DE LA CLASE PRODUCT NO SON OBJETOS ADYANCENTES RELACIONADOS, SON SIMPLEMENTE TIPOS PRIMITIVOS
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
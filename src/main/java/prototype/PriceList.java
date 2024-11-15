package prototype;

import java.util.ArrayList;
import java.util.List;

// se implementa la interfaz para poder clonar el objeto PriceList cuando se necesite
public class PriceList implements IPrototype {

    private String name;
    private List<Product> productsList = new ArrayList<>();

    public PriceList(String name) {
        this.name = name;
    }

    @Override
    public IPrototype clone() {
        PriceList clone = new PriceList(name); // se crea nuevo objeto con mismo nombre, con los mismos atributos del objeto original, y distinta referencia en memoria
        clone.setProductsList(productsList); // se copia la lista de productos
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        PriceList clone = new PriceList(name);
        List<Product> cloneProducts = new ArrayList<>();

        for (Product product : productsList) {
            Product cloneProduct = (Product) product.clone(); // se clona cada producto, y el casteo es necesario porque clone retorna un IPrototype
            cloneProducts.add(cloneProduct); // se agrega el producto clonado a la lista de productos clonados
        }
        clone.setProductsList(cloneProducts);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +
                " - PriceList{" +
                "name='" + name + '\'' +
                ", productsList=" + productsList +
                '}';
    }
    // imprimir referencia en objeto con to string (si no se implementa, se imprime la referencia en memoria por defecto
    // System.identityHashCode(this)
    // PERO TENEMOS QUE CONVERTIRLO A HEXADECIMAL PARA QUE SEA MAS LEGIBLE
    // CON EL METODO Integer.toHexString()
}
package prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //lISTA DE PRECIOS INICIAL
        PriceList priceList = new prototype.PriceList("Lista normal");
        List<Product> productList = List.of(new Product("PC", 600000),
                new Product("Laptop", 800000),
                new Product("Tablet", 300000),
                new Product("Smartphone", 400000),
                new Product("Smartwatch", 200000));

        priceList.setProductsList(productList);
        System.out.println(priceList);

        // EJEMPLO, HACER LISTAS DE PRECIOS REFERENCIALES, ASI NO SE CREAN UNO POR UNO OBJETOS, SOLO COPIANDOSE Y CAMBIANDO LOS PRECIOS

        PriceList priceList2 = (PriceList) priceList.clone();
        priceList2.setName("Lista Prefer");

        for (Product product : priceList2.getProductsList()) {
            product.setPrice(product.getPrice() * 0.7);
        }
        System.out.println(priceList2);
        // Se crean objetos listas diferentes, pero los productos dentro son los mismos en memoria de la lista original(CLONACION SIMPLE)

        PriceList priceList3 = (PriceList) priceList.deepClone();
        priceList3.setName("Lista VIP");

        for (Product product : priceList3.getProductsList()) {
            product.setPrice(product.getPrice() * 0.9);
        }
        System.out.println(priceList3);
        // Se crean objetos listas diferentes, y tambien los productos son objetos diferentes, es decir, nuevos objetos (CLONACION PROFUNDA)
    }
}

/*
Patron creacional Prototype

Nos ayuda a la creacion de objetos, permitiendo copiar(clonar) objetos existentes, sin que el codigo dependa de sus clases.
No crea objetos con operador new, sino que los crea clonandolo de un objeto existente.

2 tipos de clonaciones

1. Simple = Clonamos el objeto, pero no los objetos adyacentes asociados, es decir, si el objeto tiene atributos que son objetos, como una lista de precios, que tiene asociado otro objeto llamado productos (se copia solo la lista de precios, pero no los productos)
2. Profunda = Se clona absolutamente todos, es decir, el objeto principal y los adyancentes relacionados

Un objeto ya con atributos definidos, se le hace un copiar y pegar, es decir, dos objetos con los mismos atributos
pero con distinta referencia en memoria, es decir dos objetos diferentes.
 */

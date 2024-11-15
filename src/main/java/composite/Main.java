package composite;

public class Main {
    public static void main(String[] args) {

        BaseItem inventario = new Bolsa("Inventario"); // el inventario es una bolsa que contiene items y bolsas
        
        BaseItem bolsaMonedas = new Bolsa("Bolsa de monedas");
        BaseItem bolsaPociones = new Bolsa("Bolsa de pociones");

        BaseItem monedas = new Item("Monedas", 3);
        bolsaMonedas.add(monedas);

        BaseItem pocionMagica = new Item("Poción de vida", 3);
        BaseItem pocionVida = new Item("Poción mágica", 3);
        bolsaPociones.add(pocionMagica);
        bolsaPociones.add(pocionVida);

        BaseItem espada = new Item("Espada", 3);
        BaseItem escudo = new Item("Escudo", 3);
        BaseItem armadura = new Item("Armadura", 3);

        inventario.add(bolsaMonedas);
        inventario.add(bolsaPociones);
        inventario.add(espada);
        inventario.add(escudo);
        inventario.add(armadura);

        System.out.println("El valor total del inventario es: " + inventario.getValor());
    }
}


/*
PATRON DE DISEÑO COMPOSITE

El patrón de diseño Composite es un patrón estructural que permite componer objetos en estructuras de árbol
para representar jerarquías de parte-tDO.
El patrón Composite permite a los clientes tratar de manera uniforme a los objetos individuales y a las composiciones de objetos.

SE BASA EN LOS ARBBOLES - LAS FUNCIONES RECURSIVAS ESTAN INTERRELACIONADA, YA QUE AMBAS TIENEN EN COMUN QUE SON ESTRUCTURAS
QUE SE CONTIENEN A SI MSIMAS

UN ARBOL ESTA FORMADA POR ARBOLES, Y UN EJEMPLO EN LA VIDA REAL SERIA UN SISTEMA DE ARCHIVADO DE CARPETAS INFORMATICAS
TENEMOS ARCHIVOS QUE PUEDEN SER DOS TIPOS, CARPETAS O DOCUMENTOS, Y LAS CARPETAS PUEDEN TENER HIJOS A LA DERECHA O IZQUERDA, Y LOS QUE NO SERAN DOCUMENTOS



 */
package abstractfactory;

import abstractfactory.factories.FabricaRopaDeportiva;
import abstractfactory.factories.FabricaRopaGala;
import abstractfactory.productos.Camisa;
import abstractfactory.productos.Pantalon;
import abstractfactory.productos.zapato.ZapatoDeportivo;
import abstractfactory.productos.zapato.ZapatoGala;

public class Main {
    public static void main(String[] args) {

        // FABRICA DE ROPA DEPORTIVA
        RopasFactory fabricaRopaDeportiva = new FabricaRopaDeportiva();

        Camisa camisaDeportiva = fabricaRopaDeportiva.crearCamisa();
        ZapatoDeportivo zapatoDeportivo = (ZapatoDeportivo) fabricaRopaDeportiva.crearZapatos();
        Pantalon pantalonDeportivo = fabricaRopaDeportiva.crearPantalon();

        System.out.println("\n---> Ejemplo de ropa deportiva <---");
        camisaDeportiva.tieneBotones();
        pantalonDeportivo.tipoDeCierre();
        zapatoDeportivo.sonParaCorrer();

        // FABRICA DE ROPA DE GALA
        RopasFactory fabricaRopaGala = new FabricaRopaGala();

        Camisa camisaGala = fabricaRopaGala.crearCamisa();
        ZapatoGala zapatoGala = (ZapatoGala) fabricaRopaGala.crearZapatos();
        Pantalon pantalonGala = fabricaRopaGala.crearPantalon();

        System.out.println("\n---> Ejemplo de ropa de gala <---");
        camisaGala.tieneBotones();
        pantalonGala.tipoDeCierre();
        zapatoGala.sonParaCorrer();
    }
}

/*
Patron Abstract Factory

Patron creacional (crear objetis) que nos permite producir familias de objetos relacionados sin especificar sus clases concretas

Esto quiere decir, creamos fabrica abstracta global, que se dividira en fabricas pequeñas que se encargaran de crear objetos concretos relacionados

Ejemplo: tenemos 3 familias de diseños (arte decorativo, victoriana y moderno), y tenemos una fabrica de silla, sofas y mesillas para cada familia
y el cliente pide familias de objetos que combienen
Las familias de objetos son aquellos que se complementan, relacionan y combinan entre si

EJEMPLO PRACTICO

interface FabricaMuebles {
    public Silla crearSilla();
    public Sofa crearSofa();
    public Mesilla crearMesilla();
   }

Y DE ESA FABRICA GENERAL SE DESPRENDEN OTRAS DIFERENTES FABRICAS CONCRETAS PARA CREAR FAMILIAS DE OBJETOS

FabricaMueblesVictoriana {
    public Silla crearSilla() {
        return new SillaVictoriana();
    }
    public Sofa crearSofa() {
        return new SofaVictoriana();
    }
    public Mesilla crearMesilla() {
        return new MesillaVictoriana();
    }
 }

FabricaMueblesModerno {
    public Silla crearSilla() {
        return new SillaModerno();
    }
    public Sofa crearSofa() {
        return new SofaModerno();
    }
    public Mesilla crearMesilla() {
        return new MesillaModerno();
    }
 }

PASOS A SEGUIR:

1. CREAR INTERFACES PARA CADA OBJETO QUE SE DESEE CREAR, CON METODOS IDENTIFICADORES DE CADA OBJETO
2. A TRAVES DE LA CREACION DE OTRA INTERFAZ, CREAR FABRICA DE OBJETOS CON METODOS QUE RETORNEN LOS OBJETOS DESEADOS
3. En ELLA SE DEBEN CREAR METODOS QUE RETORNEN LOS OBJETOS DESEADOS POR MEDIO DE UN METODO CREATE
4. CREAMOS INTERFACES DE LOS OBJETOS QUE SE DESEAN CREAR, QUE IMPLEMENTEN METODOS IDENTIFICADORES DE CADA OBJETO
5. CREAMOS PAQUETES Y CLASES DE LOS OBJETOS QUE SE DESEAN CREAR, QUE IMPLEMENTEN LAS INTERFACES DE LOS OBJETOS QUE SE DESEAN CREAR
6. CREAR FABRICAS ESPECIFICAS PARA LAS FAMILIAS DE OBJETOS QUE SE DESEAN CREAR, QUE IMPLEMENTEN LA INTERFAZ general RopasFactory, crando un paquete factories
7. EN EL MAIN SE INSTANCIA LA FABRICA GENERAL, Y EN EL NEW SE INSTANCIA LA FABRICA ESPECIFICA QUE SE DESEA CREAR
8. Se instancia el tipo de objeto que se desea crear, y se llama al metodo de la fabrica especifica que se desea crear, junto al metodo de creacion de un tipo especifico de objeto
O TAMBIEN SE PUEDE INSTANCIAR EL OBJETO DESEADO, Y LLAMAR AL METODO DE LA FABRICA ESPECIFICA QUE SE DESEA CREAR, CON UN CASTEO DEL OBJETO DESEADO, JUNTO AL METODO DE CREACION DE UN TIPO ESPECIFICO DE OBJETO
 */

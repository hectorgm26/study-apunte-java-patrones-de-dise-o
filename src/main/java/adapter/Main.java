package adapter;

import adapter.adapter.CSVFileAdapter;
import adapter.adapter.ExcelFileAdapter;
import adapter.adapter.FileAdapter;
import adapter.adapter.IInputFileReader;
import adapter.model.Persona;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {

    // referenciar la ruta del archivo excel
    // con esto referencimaos la ruta del archivo excel
    // el file separator es igual a /, pero aseguea que funcione en cualquier sistema operativo
    private static final String FILE_PATH = "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {

        // EXCEL

        // Leer excel y definimos el adaptador que queremos usar
        // el excelfileadapter implementa la interfaz iinputfilereader, y por eso se puede instanciar
        IInputFileReader excelFileAdapter = new ExcelFileAdapter();

        // declararemos la clase que implemente el adaptador
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
        InputStream inputStream = new FileInputStream(FILE_PATH + "ArchivoExcel.xlsx");
        List<Persona> personaList = fileAdapter.readFile(inputStream);
        System.out.println(personaList);

        // CSV

        // leer csv y definimos el adaptador que queremos usar
        IInputFileReader csvFileAdapter = new CSVFileAdapter();

        // declararemos la clase que implemente el adaptador
        FileAdapter fileAdapter2 = new FileAdapter(csvFileAdapter);
        InputStream inputStream2 = new FileInputStream(FILE_PATH + "ArchivoCSV.txt");
        List<Persona> personaList2 = fileAdapter2.readFile(inputStream2);
        System.out.println(personaList2);

    }
}

/*
PATRON DE DISEÑO ADAPTER

ES UN PATRON ESTRUCTURAL QUE NOS PERMITE ADAPTAR UNA INTERFAZ A OTRA INTERFAZ QUE ESPERAMOS
ES DECIR, NOS PERMITE ADAPTAR UNA INTERFAZ QUE NO SE AJUSTA A NUESTRO SISTEMA A UNA INTERFAZ QUE SI SE AJUSTA

ESTE PATRON PERMITE LA COLABORACION ENTRE OBJETOS CON INTEFACES INCOMPATIBLES
EJEMPLO, UN AUTO NECESITA ANDAR, PERO DONDE TRANSITA SOLO HAY VIAS DE TREN, NO CARRETERA, Y POR ESO SE CREA ADAPTAR
QUE PERMITE AL AUTO ANDAR POR LAS VIAS DE TREN, SIN NECESIDAD DE CAMBIAR EL AUTO O TRANSFORMARLO

EL EJEMPLO DIARIO DE TODOS LOS DIAS ES CONECTAR UN CELULAR AL CARGADOR DE CORRIENTE, PERO SI VAMOS A OTRO PAIS, NO PODEMOS OCUPARLO
Y POR ESO COMPRAMOS UN ADAPTADOR DE CORRIENTE QUE NOS PERMITE CONECTAR EL CARGADOR A LA CORRIENTE DEL OTRO PAIS

CUANDO TENGO COSAS INCOMPATIBLES, CREO UN ADAPTADOR QUE ME PERMITE HACER UN PUENTE DE CONEXION Y QUE EL PROGRAMA FUNCIONE NORMALMENTE



ESTE PROGRAMA DE EJEMPLO ES UNA APLICACION QUE GESTIONA PERSONAS CLIENTES, Y LA APP TRABAJA CON LA INFO DE LOS CLIENTES
LA CUAL SE CARGA, LEE Y GUARDA EN LA BASE DE DATOS, MEDIANTE DIFERENTES ARCHIVOS, COMO EXCEL
Y CON EL TIEMPO, SE REQUIERE IMPLEMENTAR CARGAR LA INFO MEDIANTES ARCHIVOS CSV
Y MAS ADELANTE TODAVIA, SE REQUIERE IMPLEMENTAR LEER ARCHIVOS JSON, Y POR ESTO, DEBERIA APLICARSE EL PATRON ADAPTER
POR TANTO, UN ADAPTER LEERA ARCHIVOS EXCEL, OTRO CSV Y OTRO JSON


PASOS A SEGUIR:

1. SE CREA LA CLASE MODELO PERSONA, QUE CONTIENE LOS ATRIBUTOS DE UNA PERSONA, COMO NOMBRE, APELLIDO Y EDAD, CON CONSTRUCTOR VACIO Y OTRO CON PARAMETROS, Y SUS METODOS GETTERS Y SETTERS
2. SE CREA PAQUETE ADAPTER, CREANDO UNA INTERFAZ QUE LA HEREDARAN TODOS LOS ADAPTADORES
3. SE CREA LA INTERFAZ IINPUTFILEREADER, QUE CONTIENE UN METODO READFILE QUE RECIBE UN INPUTSTREAM Y DEVUELVE UNA LISTA DE PERSONAS
4. SE CREA LA CLASE EXCELFILEADAPTER QUE IMPLEMENTA LA INTERFAZ IINPUTFILEREADER, Y SE IMPLEMENTA EL METODO READFILE, QUE RECIBE UN INPUTSTREAM, Y SE LEE EL ARCHIVO EXCEL, Y SE TRANSFORMA EN UNA LISTA DE PERSONAS
 */
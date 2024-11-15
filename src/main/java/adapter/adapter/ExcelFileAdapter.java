package adapter.adapter;

import adapter.model.Persona;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileAdapter implements IInputFileReader {

    // ACA SE TIENE EL METODO READFILE, Y COMO PARAMETRO ESTARA EL ARCHIVO, Y COMO ESTE ADAPTADOR ES DE EXCEL, SE LEERA EL ARCHIVO EXCEL
    // PARA LEER EXCEL USAREMOS LA LIBRERIA APACHE POI
    @Override
    public List<Persona> readFile(InputStream inputStream) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream); // SE LEE EL LIBRO EXCEL

            XSSFSheet sheet = workbook.getSheetAt(0); // SE LEE LA HOJA DEL LIBRO

            List<Persona> personas = new ArrayList<>();

            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                int cell = row.getFirstCellNum();

                Persona persona = new Persona();
                persona.setNombre(String.valueOf(row.getCell(cell)));
                persona.setApellido(String.valueOf(row.getCell(++cell)));
                persona.setEdad((int) row.getCell(++cell).getNumericCellValue());

                personas.add(persona);
            }

            workbook.close();
            return personas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/*
ESTE ADAPTAOR LEERA ARCHIVOS EXCEL


 */

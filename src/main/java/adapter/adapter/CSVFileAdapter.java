package adapter.adapter;

import adapter.model.Persona;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class CSVFileAdapter implements IInputFileReader {

    // leemos el archivo csv con la dependencia opencsv
    @Override
    public List<Persona> readFile(InputStream inputStream) {

        Reader reader = new InputStreamReader(inputStream);

        // estrategia de lectura de archivo
        ColumnPositionMappingStrategy<Persona> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Persona.class);

        // se colocan propiedades del objeto
        strategy.setColumnMapping("nombre", "apellido", "edad");

        // con esto convertimos el archivo csv a una lista de objetos de tipo Persona
        CsvToBean<Persona> csvToBean = new CsvToBeanBuilder<Persona>(reader)
                .withMappingStrategy(strategy)
                .withType(Persona.class)
                .withSeparator(',')
                .withSkipLines(1)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<Persona> personaList = csvToBean.parse();

        return personaList;
    }
}

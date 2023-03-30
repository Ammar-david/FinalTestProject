package utilities;

import org.python.antlr.ast.Str;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDTT extends CommonOps{

    @DataProvider (name = "data-provider-user")
    public Object[][] getDataObject(){
        return getDataFromCSV (getData("DTTFile"));
    }

    public static List<String> readCSV (String csvFile){

        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static Object[][] getDataFromCSV(String filePath) {
        Object[][] data = new Object[5][2];
        List<String> csvdata = readCSV((filePath));
        for (int i = 0; i < csvdata.size(); i++) {
            data[i][0] = csvdata.get(i).split(",")[0];
            data[i][1] = csvdata.get(i).split(",")[1];
        }
        return data;
    }

}



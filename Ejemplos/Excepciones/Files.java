import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Files {

    public String getContent(String archivo) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String text = "";
        String line;
        while ((line = reader.readLine()) != null) {
            text += line; 
        }

        return text;
    }

}
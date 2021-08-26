import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class acessarContacto {

    public String infoContact(String direction) {
        
        List<String> contentDirec = new ArrayList<String>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String bfRead;

            while ((bfRead = bf.readLine()) != null) {
                // temp = temp + bfRead;
                contentDirec.add(bfRead);

            }

        } catch (Exception error) {
            error.printStackTrace();
        }

        return contentDirec.toString();

    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class buscarContacto {

    public void filtrarContactos(String dato) {

        String lineaTemp;
        FileReader frTemp;
        BufferedReader brTemp;

        File miDir = new File("");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(miDir.getAbsolutePath()))) {
            for (Path file : stream) {

                String fileString = file.toString();

                if (fileString.endsWith("txt")) {

                    frTemp = new FileReader(miDir.getAbsolutePath() + "\\" + file.getFileName());
                    brTemp = new BufferedReader(frTemp);

                    while ((lineaTemp = brTemp.readLine()) != null) {

                        if (lineaTemp.contains(dato)) {
                            System.out.println("Contacto: " + file.getFileName() + " contiene el dato: " + dato);
                        }
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

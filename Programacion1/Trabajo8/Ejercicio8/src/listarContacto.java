import java.io.File;
import java.util.Arrays;
//import java.io.IOException;
//import java.nio.file.DirectoryStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class listarContacto {
    public void listaDeContactos() {
        final String pathDirectory = ".";

        //Lista todos los archivos que estan en el directorio del proyecto.
        String[] directoryContent = new File(pathDirectory).list();

        for (String string : directoryContent) {
            if (string.endsWith("txt")) {
                System.out.println(string);
            }

        }

    }
}

/*
 * final String NameDirectory =
 * "C:\\Users\\Cristian Mello\\Documents\\Archivos\\Ifsul\\Programacion1\\Trabajo8\\Menu"
 * ;
 * 
 * try (DirectoryStream<Path> ds =
 * Files.newDirectoryStream(Paths.get(NameDirectory))) {
 * 
 * for (Path ruta : ds) {
 * 
 * System.out.println(ruta.getFileName());
 * 
 * } } catch (IOException e) { e.printStackTrace(); }
 */

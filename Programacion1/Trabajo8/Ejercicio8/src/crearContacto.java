import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class crearContacto {

    public void nuevoContacto(String nome, String telefono, String email) {
        String nameFile = "";

        try {

            String parts[] = nome.split(" ");
            for (String x : parts) {
                nameFile += x;
            }

            File file = new File(nameFile + ".txt");
                

            if (!file.exists()) {
                file.createNewFile();

                System.out.println(file.getName() + " ha sido creado");

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                pw.print("Nome: ");
                pw.println(nome);
                pw.print("Telefone: ");
                pw.println(telefono);
                pw.print("Email: ");
                pw.println(email);

                pw.close();

            } else {
                System.out.println(file.getName() + " ya ha sido creado anteriormente");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

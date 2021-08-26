import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String[] meses = { " ", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };

        System.out.println("Ingrese una fecha");
        String fecha = input.nextLine();

        if (fecha.charAt(2) == ' ') {

            String[] fechaRota = fecha.split(" ");

            System.out.print(fechaRota[0] + "/");

            for (int i = 1; i <= meses.length-1; i++) {
                if (meses[i].equalsIgnoreCase(fechaRota[2])) {
                    System.out.print(i + "/");
                }

            }
            System.out.println(fechaRota[4]);
        } else {
            String[] fechaRota = fecha.split("/");
            System.out.print(fechaRota[0] + " de ");
            int mes = Integer.parseInt(fechaRota[1]);
            System.out.print(meses[mes] + " de ");
            System.out.println(fechaRota[2]);
        }

        /*
          System.out.
          println("Ingrese una fecha en uno de los siguientes formatos: dd-MM-yyyy, yyyy-MM-dd "
          );
          
          String Fecha = input.nextLine(); char caracter = Fecha.charAt(2);
          
          if (Character.isLetterOrDigit(caracter)) {
          
          SimpleDateFormat formatoOrigem2 = new SimpleDateFormat("yyyy-MM-dd"); Date
          data2 = formatoOrigem2.parse(Fecha); // string com a data no formato
          ano-mês-dia SimpleDateFormat formatoDestino = new
          SimpleDateFormat("dd-MM-yyyy"); String formatoDiaMesAno =
          formatoDestino.format(data2);
          
          System.out.println(formatoDiaMesAno); }
          
          else { SimpleDateFormat formatoOrigem = new SimpleDateFormat("dd-MM-yyyy");
          Date data = formatoOrigem.parse(Fecha); // string com a data no formato
          dia-mês-ano
          
          SimpleDateFormat formatoDestino = new SimpleDateFormat("yyyy-MM-dd"); String
          formatoAnoMesDia = formatoDestino.format(data);
          
          System.out.println(formatoAnoMesDia);
         
          }
         */

    }
}

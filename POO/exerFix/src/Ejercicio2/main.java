package Ejercicio2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main( String[] args ){

        Thread caballo1 = new Thread(new Caballo("Caballo 1"));
        Thread caballo2 = new Thread(new Caballo("Caballo 2"));
        Thread caballo3 = new Thread(new Caballo("Caballo 3"));

        caballo1.start();
        caballo2.start();
        caballo3.start();



    }


}

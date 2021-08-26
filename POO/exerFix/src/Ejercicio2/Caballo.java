package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Caballo extends main implements Runnable {

    private int tempoSleep;
    private String caballo;
    private final Random generator = new Random();
    static List<Integer> myList = Collections.synchronizedList(new ArrayList());


    public Caballo(String caballo){
        this.caballo = caballo;
        tempoSleep = generator.nextInt(2000);
    }

    @Override
    public void run() {
        int j =0;
        for (int i=0; i<30; i++){
            try {
                System.out.printf("%s esta en la posicion "+ (i+1) +" y se ha dormido por %s segundos.\n", caballo, (double) tempoSleep/1000);
                Thread.sleep(tempoSleep);
            } catch (InterruptedException e){
                System.out.printf("%s %s\n", caballo, " se detuvo prematuramente");
            }
            System.out.println(caballo+" acabou de dormir");
            if ((i+1)==30) {
                myList.add(1);
                System.out.println(caballo + " ha terminado la carrera en la posición " + myList.size());
            }
        }

    }
}

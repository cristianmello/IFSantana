package Ejercicio1;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Primos(1,1000));
        Thread thread2 = new Thread(new Primos(1001,2000));
        Thread thread3 = new Thread(new Primos(2001,3000));
        Thread thread4 = new Thread(new Primos(3001,4000));
        Thread thread5 = new Thread(new Primos(4001,5000));
        Thread thread6 = new Thread(new Primos(5001,6000));
        Thread thread7 = new Thread(new Primos(6001,7000));
        Thread thread8 = new Thread(new Primos(7001,8000));
        Thread thread9 = new Thread(new Primos(8001,9000));

        thread1.start();
        try {
            thread1.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread2.start();
        try {
            thread2.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread3.start();
        try {
            thread3.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread4.start();
        try {
            thread4.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread5.start();
        try {
            thread5.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread6.start();
        try {
            thread6.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread7.start();
        try {
            thread7.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread8.start();
        try {
            thread8.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }
        thread9.start();
        try {
            thread9.join();
        } catch(InterruptedException ex){
            System.out.println(ex);
        }


    }
}

package Ejercicio1;

public class Primos implements Runnable {
    private int min;
    private int max;

    public Primos(int min, int max){
        this.min = min;
        this.max = max;
    }

    public boolean primo(int valor){
        for(int i=2; i<valor/2+1;i++){
            if(valor%i==0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println("Primos entre: "+min+"-"+max);
        for(int i=min; i<=max;i++){
            if(primo(i)){
                System.out.println(i);
            }
        }
        System.out.println("");
    }

}

public class Ejercicio2 {
    public static void main(String[] args) {
       int valores[][] = new int[40][40];

       for (int i=0; i < 40; i++) {
           for(int j=0; j < 40; j++) {
        valores[i][j] = (int) (Math.random()*255);
      }
    }
    
    for (int i=0; i < 40; i++) {
        for(int j=0; j < 40; j++) {
    System.out.print(valores[i][j]+ " | ");
        }
        System.out.println("");
    }
    }
}

public class ejercicio1 {
    public static void main(String[] args){
        int numero=0, suma=0;

        for (int i = 1; i <= 3; i++) {

            numero = (int)(Math.random()*6+1);
            System.out.println("Número " +i+ " = " + numero);
            suma = suma + numero ;
        }
 
        System.out.println("Suma total = " + suma);

    }
}

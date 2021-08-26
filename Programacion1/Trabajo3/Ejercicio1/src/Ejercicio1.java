import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int notas[] = new int[5];
        int nota = 0;
        int aux;

        for(int i=0; i<5;i++){
            System.out.print("Ingrese su nota: ");
            notas[i] = input.nextInt();
            nota = notas[i] + nota;
        }

        for(int i=0; i<5;i++){
            for(int j=i+1; j<5; j++ ){
                if(notas[i] < notas[j]){
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                }
            }      
        }
        nota = nota/5;

        System.out.print(Arrays.toString(notas));
        System.out.print("Media aritmetica de notas: " + nota);


    }    
}

import java.util.*;

public class trabajo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int []x = {2,1,4,3,6,5};
		int i,j,aux;

		for(i=0;i<6;i+=2) {
		   aux=x[i];
		   x[i]=x[i+1];
		   x[i+1]=aux;
		}

		for(i=0;i<6;i=i+1) {
		    System.out.print(x[i]+" | ");
		}
	}
}
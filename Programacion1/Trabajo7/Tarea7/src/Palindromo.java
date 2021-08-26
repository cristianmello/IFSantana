public class Palindromo {

   public boolean palindromo(String cadena){

           boolean valor=true;
           int indice;    
           String cadena2="";

           //quitamos los espacios
           for (int x = 0; x < cadena.length(); x++) {
               if (cadena.charAt(x) != ' ')
                   cadena2 += cadena.charAt(x);
           }

           //volvemos a asignar variables
           cadena=cadena2;    
           indice=cadena.length();

           //comparamos cadenas
           cadena =cadena.toLowerCase();
           for (int i= 0 ; i < cadena.length(); i++){        
              if (cadena.substring(i, i+1).equals(cadena.substring(indice - 1, indice)) == false ) {
                  //si una sola letra no corresponde no es un palindromo por tanto
                  //sale del ciclo con valor false
                   valor=false;
                   break;
              }
              indice--;
           }
           System.out.println(cadena2);
           return valor;
       }
       
}
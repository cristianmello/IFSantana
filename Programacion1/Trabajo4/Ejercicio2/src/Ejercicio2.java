public class Ejercicio2 {

    public static void main(String[] args) {

        String sustantivos[] = { "Mi vecina", "La casa", "Juanito", "El Profesor" };
        String verbos[] = { "tiene", "cocina", "ama", "habla" };
        String local[] = { "en Rivera.", "en Santana de Livramento.", "en Tacuarembo.", "Montevideo." };

        for (int i = 0; i < 12; i++) {
            

                int randSustants = (int) (Math.random() * 4);
                System.out.print(sustantivos[randSustants]);

                int randverbs = (int) (Math.random() * 4);
                System.out.print(" " + verbos[randverbs]);

                int randlocals = (int) (Math.random() * 4);
                System.out.print(" " + local[randlocals]);
                
                System.out.println();

        }

        
    }
}
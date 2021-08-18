package ejercicio2;

public class Preguica extends Animal {

    public Preguica(String Acao, String Nome, int Idade) {
        super(Acao,Nome, Idade);
    }

    @Override
    public String emiteSom() {
        return "Ó preguica com nome:" + getNome() + " e idade:" + getIdade() + " faz: ¡JUIIIIIIII!\n";
    }

}

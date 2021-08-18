package ejercicio2;

public class Cachorro extends Animal {

    public Cachorro(String Acao, String Nome, int Idade) {
        super(Acao,Nome, Idade);
    }

    @Override
    public String emiteSom() {
        return"Ó cachorro com nome:" + getNome() + " e idade:" + getIdade() + " faz: ¡Guau!¡Guau!\n";
    }

}

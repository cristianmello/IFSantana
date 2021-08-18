package ejercicio2;

public class Cavalo extends Animal{

    public Cavalo(String Acao, String Nome, int Idade) {
        super(Acao, Nome, Idade);
    }

    @Override
    public String emiteSom() {
        return "Ó cavalo com nome:"+getNome()+" e idade:"+getIdade()+" faz: ¡HHIIIIII!\n"; 
    }

}

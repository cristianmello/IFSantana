package ejercicio2;

public class Animal {

    protected String Nome, Acao;
    protected int Idade;

    public Animal(String Acao, String Nome, int Idade) {
        this.Acao = Acao;
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public String getAcao() {
        return Acao;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String emiteSom() {
        return null;
    }

}

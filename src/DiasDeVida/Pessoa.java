package DiasDeVida;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int Calculo() {
        if (idade < 0) {
         return 0;
        } else {
            return idade * 365;
        }
    }
}

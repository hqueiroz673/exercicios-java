package Heranca_animal;

public class Gato extends Animal {

    Gato(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
}

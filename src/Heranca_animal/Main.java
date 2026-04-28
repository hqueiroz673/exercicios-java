package Heranca_animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro("Thor", 6);
        Animal cat = new Gato("Sam", 4);

        dog.emitirSom();
        cat.emitirSom();
    }
}

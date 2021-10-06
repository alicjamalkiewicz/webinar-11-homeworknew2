package pl.test.OOP_2;

public class Cat extends Animal {

    public Cat() {
        System.out.println("Konstruktor klasy kot");
    }

    @Override
    public void useVoice() {
        System.out.println("Meow");
    }

    @Override
    public int getAge(int x) {
        return 0;
    }

    @Override
    public String getAnimalVoice() {
        return AnimalVoice.CAT.getText();
    }
}

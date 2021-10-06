package pl.test.OOP_2;

public class Dog extends Animal implements Petable, Runnable {
    private static int count = 0;

    private int age;

    public Dog() {
        count++;
        System.out.println("Konstruktor klasy Dog");
    }

    public void eat() {
        System.out.println("Pies je kość");
    }

    @Override
    public void useVoice() {
        System.out.println("Woof");
    }

    @Override
    public int getAge(int x) {
        return 0;
    }

    @Override
    public String getAnimalVoice() {
        return AnimalVoice.DOG.getText();
    }

    @Override
    public void pet() {
        // implementacja metody z Petable
    }

    @Override
    public void run() {
        // implementacja metody z Runnable
    }

    public int getCount() {
        age = count;
        return count;
    }

    public static int getNumCount() {

        return count;
    }
}

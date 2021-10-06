package pl.test.OOP_2;

public class Elephant extends Animal {
    @Override
    public void useVoice() {
        System.out.println("tralala");
    }

    @Override
    public int getAge(int x) {
        return x + 10;
    }

    @Override
    public String getAnimalVoice() {
        return AnimalVoice.ELEPHANT.getText();
    }
}

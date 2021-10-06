package pl.test.OOP_2;

public interface Petable {
    void pet();

    default void printMsg() {
        System.out.println("Domyślna implementacja");
    }
}

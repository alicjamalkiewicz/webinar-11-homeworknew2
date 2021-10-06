package pl.test.OOP_2;

import pl.test.access.Person;
import pl.test.OOP_2.*;

import javax.crypto.spec.PSource;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(Person.PI);

        Dog pies = new Dog();
        System.out.println("Wartość pola statycznego count: " + pies.getCount());

        Dog pies2 = new Dog();
        System.out.println("Wartość pola statycznego count: " + pies.getCount());
        System.out.println("Wartość pola statycznego count: " + pies2.getCount());

        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());

        System.out.println("--------");
//        Person student = new Person();
//        String x = student.getFirstname();
//
//	// Animal animal = new Animal(); -> klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji
//
        Cat cat = new Cat();

        Dog dog = new Dog();

        Dog dog2 = new Dog();
//
//        // w polimorfizimie mamy dostęp tylko do metod, które są w klasie bazowej lub interfejsie, który implementujemy
//        Petable petable = new Dog();
//        petable.printMsg();
//
//        System.out.println("---------");
//
//        Animal animalDog = new Dog();
//        Animal animalCat = new Cat();
//        animalDog.useVoice(); //
//
        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[2] = dog2;
        animals[1] = cat;
        animals[3] = new Elephant();
//
//        System.out.println("Początek pętli animals");
//
//        for (int i = 0; i < animals.length; i ++) {
//            System.out.print(animals[i].getAnimalVoice());
//            animals[i].useVoice();
//        }
//
//        System.out.println("Koniec pętli animals");
//
//        System.out.println("------POLIMORFIZM-----");
//        Dog dogPolimorfizm = new Dog(); // mam dostęp do metod z klasy dog + klasy abstrakcyjnej + w interfejsie
//        dogPolimorfizm.eat();
//
//        Animal animalPolimorfizm = new Dog(); // mogę wywołać tylko metody, które są w klasie abstrakcyjnej
//
//        Petable petablePolimorfizm = new Dog(); // mogę wywołać tylko metody, które są w interfejsie


        System.out.println("ZADANIE DOMOWE 04.10");

        /*
        A.stworzyć listę zwierząt, dodać zwierzęta, sprawdzić rozmiar i czy lista jest pusta
        B.stworzyć zbiór: dodać imiona zwierząt z listy (stworzonej podpunkcie a)
        C.stworzyć mapę: klucz to imię zaś wartość to obiekt. Następnie przejdź pętlą i wyświetl informacje o obiekcie
        */

        System.out.println("\nA-------\n");

        dog.setName("Tościk");
        dog2.setName("Łajka");
        cat.setName("Gustaw");

        List<String> animalsList = new LinkedList<String>();
        animalsList.add(cat.getName());
        animalsList.add(dog.getName());
        animalsList.add(dog2.getName());
        System.out.println(animalsList);

        int listSize = animalsList.size();
        System.out.println("animalsList contains " + listSize + " elements.");

        if (animalsList.isEmpty()){
            System.out.println("This list is empty");
        }else {
            System.out.println("This list is not empty");
        }

        System.out.println("\nB-------\n");

        Set<String> animalSet = new HashSet<String>();
        animalSet.add(cat.getName());
        animalSet.add(dog.getName());
        animalSet.add(dog2.getName());

        System.out.println(animalSet);

        System.out.println("\nC-------\n");

        Map<String, String> animalsNames = new HashMap<>();

        animalsNames.put(cat.getName(), "cat");
        animalsNames.put(dog.getName(), "dog");
        animalsNames.put(dog2.getName(), "dog2");

        for (String name : animalsNames.keySet()){
            System.out.println(name + " is " + animalsNames.get(name));
        }

    }

    public static void displayText(Animal animal) {
        animal.useVoice();
    }


}

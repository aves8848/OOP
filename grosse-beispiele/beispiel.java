import java.util.ArrayList;
import java.util.List;

// Abstrakte Klasse Animal
// Diese Klasse definiert gemeinsame Eigenschaften für alle Tiere und enthält abstrakte Methoden,
// die von jeder Tierunterklasse überschrieben werden müssen.
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter-Methoden, die die Kapselung der Eigenschaften "name" und "age" sicherstellen
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstrakte Methode, die von jeder Unterklasse definiert werden muss
    public abstract void makeSound();
}

// Interface Feedable
// Dieses Interface legt fest, dass jedes fütterbare Tier eine feed-Methode haben muss.
interface Feedable {
    void feed();
}

// Klasse Lion, die von Animal erbt und Feedable implementiert
// Lion erbt die Eigenschaften und Methoden von Animal und implementiert das Feedable-Interface.
class Lion extends Animal implements Feedable {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is being fed with meat.");
    }
}

// Klasse Elephant, die von Animal erbt und Feedable implementiert
class Elephant extends Animal implements Feedable {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is being fed with vegetables.");
    }
}

// Klasse ZooKeeper, die die Beziehung zwischen Pfleger und Tier (Assoziation) repräsentiert
// Der ZooKeeper kann Tiere füttern, besitzt diese aber nicht.
class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void careForAnimal(Feedable animal) {
        animal.feed();
    }
}

// Klasse Zoo repräsentiert den Zoo als Ganzes (Aggregation)
// Der Zoo besitzt eine Liste von Tieren, die aber unabhängig existieren können.
class Zoo {
    private List<Animal> animals;
    private ZooKeeper keeper;

    public Zoo(ZooKeeper keeper) {
        this.keeper = keeper;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void feedAllAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Feedable) {
                keeper.careForAnimal((Feedable) animal);
            }
        }
    }
}

// Hauptklasse zur Ausführung der Zoo-Management-Funktionalität
public class ZooManagement {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("John");
        Zoo zoo = new Zoo(keeper);

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.makeAllSounds();
        zoo.feedAllAnimals();
    }
}

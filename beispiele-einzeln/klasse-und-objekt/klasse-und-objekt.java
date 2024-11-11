class Car {
    // Eigenschaften
    String color;
    String model;

    // Konstrukteur der Klasse
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method
    public void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", "Toyota");
        myCar.drive();
    }
}

// Hier beschreibt die Klasse Car allgemeine Eigenschaften und Verhaltensweisen für Autoobjekte. 
// Bei der Erstellung eines Objekts können wir bestimmte Werte für die Eigenschaften festlegen.
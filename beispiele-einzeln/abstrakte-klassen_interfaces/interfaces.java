interface Drivable {
    void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Car is driving");
    }
}

// Interfaces definieren den Vertrag, den eine Klasse implementieren sollte.
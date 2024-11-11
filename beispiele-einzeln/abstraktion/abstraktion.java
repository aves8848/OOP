abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Die Abstraktion wird verwendet, 
// um Vorlagen zu erstellen, die in Unterklassen implementiert werden.
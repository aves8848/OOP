class Car:
    # Konstukteur der Klasse
    def __init__(self, color, model):
        self.color = color
        self.model = model

    # Method
    def drive(self):
        print(f"The {self.color} {self.model} is driving.")

# Instanz der Klasse
my_car = Car("red", "Toyota")
my_car.drive()

# Hier beschreibt die Klasse Car allgemeine Eigenschaften und Verhaltensweisen für Autoobjekte. 
# Bei der Erstellung eines Objekts können wir bestimmte Werte für die Eigenschaften festlegen.
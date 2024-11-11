class Animal:
    def make_sound(self):
        print("Animal sound")

class Cat(Animal):
    def make_sound(self):
        print("Meow")

class Dog(Animal):
    def make_sound(self):
        print("Woof")

animals = [Dog(), Cat()]
for animal in animals:
    animal.make_sound()


# Die Polymorphismus ermöglicht es, dieselben Methoden in verschiedenen Klassen aufzurufen. 
# In diesem Beispiel wird die Methode makeSound für verschiedene Tiere aufgerufen.
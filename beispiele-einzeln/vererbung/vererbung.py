class Animal:
    def make_sound(self):
        print("Animal sound")

class Dog(Animal):
    def make_sound(self):
        print("Woof")

my_dog = Dog()
my_dog.make_sound()

# In diesem Beispiel erbt die Klasse Dog 
# von der Klasse Animal und überschreibt die Methode make_sound.
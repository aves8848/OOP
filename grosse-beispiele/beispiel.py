from abc import ABC, abstractmethod

# Abstrakte Klasse Animal
# Definiert grundlegende Eigenschaften und abstrakte Methoden, die von Unterklassen implementiert werden müssen.
class Animal(ABC):
    def __init__(self, name, age):
        self._name = name
        self._age = age

    # Eigenschafts-Getter zur Kapselung
    @property
    def name(self):
        return self._name

    @property
    def age(self):
        return self._age

    # Abstrakte Methode, die in jeder Tier-Unterklasse definiert werden muss
    @abstractmethod
    def make_sound(self):
        pass

# Interface Feedable
# Dieses Interface stellt sicher, dass fütterbare Tiere eine "feed"-Methode haben.
class Feedable:
    def feed(self):
        raise NotImplementedError

# Klasse Lion, die von Animal erbt und Feedable implementiert
class Lion(Animal, Feedable):
    def make_sound(self):
        print(f"{self.name} roars!")

    def feed(self):
        print(f"{self.name} is being fed with meat.")

# Klasse Elephant, die von Animal erbt und Feedable implementiert
class Elephant(Animal, Feedable):
    def make_sound(self):
        print(f"{self.name} trumpets!")

    def feed(self):
        print(f"{self.name} is being fed with vegetables.")

# ZooKeeper-Klasse repräsentiert die Assoziation zwischen Pfleger und Tier
# Der ZooKeeper kann Tiere füttern, die er aber nicht besitzt.
class ZooKeeper:
    def __init__(self, name):
        self.name = name

    def care_for_animal(self, animal):
        animal.feed()

# Klasse Zoo repräsentiert den Zoo als Ganzes (Aggregation)
# Der Zoo besitzt eine Liste von Tieren, aber die Tiere existieren unabhängig vom Zoo.
class Zoo:
    def __init__(self, keeper):
        self.keeper = keeper
        self.animals = []

    def add_animal(self, animal):
        self.animals.append(animal)

    def make_all_sounds(self):
        for animal in self.animals:
            animal.make_sound()

    def feed_all_animals(self):
        for animal in self.animals:
            if isinstance(animal, Feedable):
                self.keeper.care_for_animal(animal)

# Hauptprogramm zur Verwaltung des Zoos
keeper = ZooKeeper("John")
zoo = Zoo(keeper)

lion = Lion("Simba", 5)
elephant = Elephant("Dumbo", 10)

zoo.add_animal(lion)
zoo.add_animal(elephant)

zoo.make_all_sounds()
zoo.feed_all_animals()

from abc import ABC, abstractmethod

class Drivable(ABC):
    @abstractmethod
    def drive(self):
        pass

class Car(Drivable):
    def drive(self):
        print("Car is driving")

# Abstrakte Klassen definieren den Vertrag, den eine Klasse implementieren sollte.
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def get_area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def get_area(self):
        return 3.14159 * self.radius * self.radius

# Die Abstraktion wird verwendet, 
# um Vorlagen zu erstellen, die in Unterklassen implementiert werden.
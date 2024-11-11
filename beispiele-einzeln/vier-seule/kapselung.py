class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # private Eigenschaft

    # public Getter-Methode
    def get_balance(self):
        return self.__balance

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount


# Die Verkapselung schützt die Daten der Klasse. 
# In diesem Beispiel ist das Feld balance privat und wird 
# über die Methoden get_balance und deposit aufgerufen.
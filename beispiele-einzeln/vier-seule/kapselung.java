class BankAccount {
    // private Eigenschaft
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // public Getter-Methode
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}


// Die Verkapselung schützt die Daten der Klasse. 
// In diesem Beispiel ist das Feld balance privat und wird 
// über die Methoden getBalance und deposit aufgerufen.
class Account{
  int acc_num;
  String name;
  double amount;
  void insert(int acc, String n, double amt){
    acc_num = acc;
    name = n;
    amount = amt;
  }

  void deposit(double amt){
    amount = amount + amt;
    System.out.println(amt + " deposited");
  }

  void withdraw(double amt){
    if(amount < amt){
      System.out.println("Insufficient Funds");
    }
    else{
      amount = amount - amt;
      System.out.println(amt + " withdrawn");
    }
  }
  void checkBalance(){System.out.println("Balance is: " + "$" +amount);}
  void display(){System.out.println("Account Number: " + acc_num + "Name: " + name + "Balance: " + amount);}
}

class TestAccount{
  public static void main(String[] args){
    Account a1 = new Account();
    a1.insert(5225356, "Omar", 755.35);
    a1.display();
    a1.checkBalance();
    a1.deposit(2021);
    a1.checkBalance();
    a1.withdraw(1000);
    a1.checkBalance();
  }
}

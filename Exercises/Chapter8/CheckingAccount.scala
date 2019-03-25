class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double){
  override def deposit(amount: Double): Double = {balance = balance + amount - 1;balance}
  override def withdraw(amount: Double): Double = {balance = balance - amount - 1;balance}
}

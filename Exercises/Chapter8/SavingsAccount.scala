class SavingsAccount(initialBalance: Double) extends CheckingAccount(initialBalance: Double){
  var transactionsLeft=3
  override def deposit(amount: Double): Double = {
    if (transactionsLeft > 0){
      balance = balance + amount
      transactionsLeft -= 1
    }else{
      balance = balance + amount - 1
    }
    balance
  }
  override def withdraw(amount: Double): Double = {
    if (transactionsLeft > 0){
      balance = balance - amount
      transactionsLeft -= 1
    }else{
      balance = balance - amount - 1
    }
    balance
  }
  def earnMonthlyInterest(){
    balance = balance*1.1
    transactionsLeft=3
  }
}

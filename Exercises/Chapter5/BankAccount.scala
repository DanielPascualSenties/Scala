class BankAccount (private var _balance: Double){
  def balance = _balance

  def balance_(nB:Double) ={_balance=_balance}

  def deposit(amount: Double): Unit = {
    if (amount > 0)
      _balance = _balance + amount;
  }

  def withdrawal(amount: Double): Unit = {
    if (amount > 0 & amount < balance)
      _balance = _balance - amount;
  }
}


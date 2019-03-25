object Suit extends Enumeration {
  val Hearts, Diamonds, Spades, Clubs = Value
  
  def printSuit(): Unit ={
    if (this.Value == Hearts) print(9829.toChar)
    if (this.Value == Diamonds) print(9830.toChar)
    if (this.Value == Spades) print(9824.toChar)
    if (this.Value == Clubs) print(9827.toChar)
  }
}



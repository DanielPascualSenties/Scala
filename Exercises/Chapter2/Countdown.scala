object CountDown {
  def countdown(x : Int): Unit ={
    for (i<-0 to x){
      println(x-i)
    }
  }
  countdown(10)
}

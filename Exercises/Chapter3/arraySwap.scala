object arraySwap {
  def swap(a:Array[Int]): Unit ={
    for (i<-0 to a.length - 2 if (i % 2 == 0)){
      val aux = a(i)
      a(i) = a(i+1)
      a(i+1)= aux
    }
    val b= a.mkString(",")
    println(b)
  }
}

object arraySwapYield {
  def swapYield(a:Array[Int]): Unit ={
    val b= for (i<-0 to a.length - 1) yield {
      if (i % 2 == 0 && i < a.length-1) a(i+1) else if(i % 2 != 0) a(i-1) else a(i)
    }
    val c= b.mkString(",")
    println(c)
  }
}


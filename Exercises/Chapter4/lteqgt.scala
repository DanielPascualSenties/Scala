object lteqgt {
  def lteqgt(a: Array[Int], v: Int): Tuple3[Int,Int,Int] ={
    var lt,eq,gt=0
    for (i<-0 to a.length-1){
      if (a(i)>v)
        lt=lt+1
      else if (a(i)<v)
        gt=gt+1
      else eq = eq+1
    }
    return (lt,eq,gt)
  }
}

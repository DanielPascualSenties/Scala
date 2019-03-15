object MinMax {
    def minmax(a: Array[Int]): Tuple2[Int, Int] = {
    var min = a(0)
    var max = a(0)
    for (i <- 1 to a.length-1){
      if (a(i) < min) min = a(i)
      if (a(i) > max) max = a(i)
    }
    return (min,max)
  }
}

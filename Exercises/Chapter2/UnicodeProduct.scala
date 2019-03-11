class UnicodeProduct {
  def unicodeProduct(x : String): Unit = {
    var res:Long=1
    for (i <- 0 to x.length()-1) {
      res = res * x.charAt(i).hashCode()
      println(res)
    }
    print("Resultado final:")
    println(res)
  }
}

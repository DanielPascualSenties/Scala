object power {
  def power(base: Int, pow: Int): Double = {
    if (pow < 0) 1/power(base, -1*pow)
    else
    if (pow == 0) 1
    else
    if((pow % 2) != 0) base * power(base, pow-1)
    else
    if ((pow % 2) == 0) power(base, pow/2) * power(base, pow/2)
    else 0
  }
  val x = power(2,10)
  println(x)
}

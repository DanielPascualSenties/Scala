import scala.util.Random
import scala.collection.mutable.ArrayBuffer

class randomArray {
  def randomArray(length : Int) {
    val r = new Random()
    val a = new ArrayBuffer[Int]()
    for (i <- 0 to length){
      a += r.nextInt(length)
    }
    for (i <-0 until length)
      println(a(i))
  }
}


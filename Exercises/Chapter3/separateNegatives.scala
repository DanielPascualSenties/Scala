import scala.collection.mutable.ArrayBuffer
object separateNegatives {
  def separateNegatives(a:ArrayBuffer[Int]): Unit ={
    var positives = new ArrayBuffer[Int]()
    var negatives = new ArrayBuffer[Int]()
    for(i<-0 to a.length-1){
      if (a(i)>0) positives += a(i)
      else negatives += a(i)
    }
    positives = positives ++ negatives
    println(positives.mkString(","))
  }
}


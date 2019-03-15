import java.io.File

object WordCount {
  def wordCount(path:String){
  val in = new java.util.Scanner(new File(path))
  var counter = Map[String, Int]()
  while (in.hasNext()) {
    val current = in.next()
    val cv = counter.getOrElse(current,0) + 1
    counter += (current -> cv)
  }
  println(counter)
}

}

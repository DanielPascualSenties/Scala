class Point(x:Int, y:Int) {
  override def toString: String = "(" + x + "," + y + ")"
}

class LabeledPoint(label:String, x:Int, y:Int) extends Point(x,y){
  override def toString: String = label + super.toString
}

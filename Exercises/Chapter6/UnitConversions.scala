abstract class UnitConversion {
val conversionFactor: Double
  def convert(amount:Double) = amount*conversionFactor
  def convertBack(amount:Double)= amount / conversionFactor
}

object InchesToCentimeters extends UnitConversion{
  val conversionFactor=2.54
}

object GallonsToLiters extends UnitConversion{
  val conversionFactor=3.785
}
object MilesToKilometers extends UnitConversion{
  val conversionFactor=1.609
}

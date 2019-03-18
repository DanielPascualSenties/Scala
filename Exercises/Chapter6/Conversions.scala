object Conversions {
  def inchesToCentimeters(inches: Double): Double ={
    return inches*2.54
  }
  def centimetersToInches(cms: Double): Double ={
    return cms/2.54
  }
  def gallonsToLiters(gallons: Double): Double = {
    return gallons *3.785
  }
  def litersToGallons(liters: Double): Double = {
    return liters/3.785
  }
  def milesToKilometers(miles: Double): Double = {
    return miles * 1.609
  }
  def kilometersToMiles(kms: Double): Double = {
    return kms/1.609
  }
}


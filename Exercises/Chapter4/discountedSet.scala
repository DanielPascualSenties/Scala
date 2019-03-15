  val items = Map("Desktop" -> 2500, "Bike" -> 2000, "Car" -> 30000, 
"Gran Via Penthouse" -> 400000, "Beach House" -> 250000,
    "Electric Scooter" -> 250, "Surf Board" -> 400, "Ski set" -> 800, 
"Downtown Locale" -> 150000, "Workshop" -> 115000)

  val discountedItems = for {(k, v) <- items} yield (k, v.*(0.9) + "€")
  println(discountedItems.toString())
}

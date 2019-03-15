class Time(val hours:Int, val minutes:Int) {
    private val min= 60*hours+minutes;
    def before(other: Time):Boolean={
      return (other.min > min)
    }
  }

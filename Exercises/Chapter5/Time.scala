class Time(val hours:Int, val minutes:Int) {
  def before(other: Time):Boolean={
    return ((other.hours > hours) | ((other.hours == hours) & 
(other.minutes > minutes)))
  }
}

enum Direction{
  right,left,up,down
}

class Robot{
  def move(final Direction direction){
    println "$this moved to $direction"
  }
}

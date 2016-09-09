val level =
  """------
    |--ST--
    |--oo--
    |--oo--
    |------""".stripMargin
val level1=Vector(level.split("\n").map(str => Vector(str: _*)): _*)

def findChar(c: Char, levelVector: Vector[Vector[Char]]): (Int,Int) = {
  val x=levelVector.indexWhere(_.contains(c))
  val y=levelVector(x).indexOf(c)
  (x,y)
}

try {level1(-1)(1).isLetter}catch {
  case _:Throwable=> false
}
case class Pos(x: Int, y: Int) {
  /** The position obtained by changing the `x` coordinate by `d` */
  def dx(d: Int) = copy(x = x + d)
  /** The position obtained by changing the `y` coordinate by `d` */
  def dy(d: Int) = copy(y = y + d)
}
val pos1=Pos(1,2)
val pos2=Pos(1,2)
pos1.eq(pos2)
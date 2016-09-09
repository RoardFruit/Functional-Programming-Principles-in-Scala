package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =if(c==0||c==r) 1 else pascal(c-1, r-1)+pascal(c, r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean ={
    def count(char:Char):Int ={
      if (char == '(') 1
      else if (char == ')') -1
      else 0
    }
    def bc(cur:Int,chars: List[Char]):Boolean=
      if(chars.isEmpty)
        cur==0
      else {
        val sum=cur+count(chars.head)
        if (sum<0) false
        else bc(sum,chars.tail)
      }
    bc(0,chars: List[Char])
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money==0) 1
    else {
      if (coins.isEmpty || money < 0) 0
      else countChange(money, coins.tail)+countChange(money-coins.head, coins)
    }
  }
}

package streams

/**
 * Created by Mr.gong on 2016/4/9.
 */
object te extends App{

  object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  }
 println(InfiniteLevel.pathsToGoal.take(2).toList)
}

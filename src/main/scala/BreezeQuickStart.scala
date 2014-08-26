/**
 * Created by clivermore on 8/12/14.
 *
 */

import breeze.linalg._

object BreezeQuickStart extends App {

  val x = DenseVector.zeros[Double](5)

  x(2) = 2
  x(3 to 4) := .5
  x(0 to 1) := DenseVector(.1,.2)

  for {
    i <- 0 until x.length
  } x(i) = i

  val y = x.t
  //println(y)

  val z = x * y

  println (x)
  println(y)


  //println(z)


  ///println(z * x)

  //println(y * z)

  class foop {}

}

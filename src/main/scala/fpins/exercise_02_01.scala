package fpins

object Exercise_02_01 {

  def fib(n: Int): Int = {
    def go(f1: Int, f2: Int, n: Int): Int =
      if (n <= 1) f1
      else if (n==2) f2
      else go(f2, f1+f2, n-1)

    go(0,1,n)
  }

  def main(args: Array[String]): Unit = {
    println
    println("Exercise - 2.1")
    println("Fibonacci Sequence:")
    println("===================")
    printFib(1, 10)
    println("===================")

    def printFib(n: Int, max: Int): Unit = {
      if (n <= max) {
        println("Fib(%2d) = %2d".format(n, fib(n)))
        printFib(n+1, max)
      }
    }
  }

}

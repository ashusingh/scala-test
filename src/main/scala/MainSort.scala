import scala.io.StdIn

object MainSort {

  def main(args: Array[String]): Unit = {

    def readLastNames(numOfNames: Int, rs: Seq[Seq[String]] = List.empty): Seq[Seq[String]] = {
      if (numOfNames == 0) rs
      else {
        val rs1 = rs :+ readNames(numOfNames)
        readLastNames(readNextInt, rs1)
      }
    }

    readLastNames(readNextInt).map(sortLastNames).foreach{ls =>
      Console.out.println(ls.mkString("\n"))
      Console.out.println("\n")
    }

  }

  def readNames(numOfNames: Int): Seq[String] = {
    Seq.tabulate(numOfNames)(_ => StdIn.readLine())
  }

  def readNextInt: Int = {
    StdIn.readInt()
  }

  def sortLastNames(names : Seq[String]) : Seq[String] = {
        names.filter(_.nonEmpty).sortBy{ x=>
          x.toList match{
            case c1 :: Nil => c1.toString
            case c1 :: c2 :: t => s"$c1$c2"
          }

        }
  }
}

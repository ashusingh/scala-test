import scala.Console.out
import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {
    def readLines(lines : Seq[String] = Seq.empty)  : Seq[String] = {
      val line: String = StdIn.readLine()
      if(line != null) readLines(lines :+ line)
      else lines
    }

    readLines().foreach{text =>
      if(hasString(text, "problem")) out.println("yes")
      else out.println("no")
    }
  }

  def hasString(line: String, matchString : String): Boolean = {
    line.toLowerCase.contains(matchString)
  }

}

package editor

object Editor {
  val d = new SecretMaramaLogic("example");

  def main(args: Array[String]): Unit = {
    println(Hello() + " Marama!")

    // Echo all arguments
    PrintArray(args)

    println("Goodbye Marama!")
  }

  /**
    * Prints all  elements from an array recursively.
    * @param args Array of words or arguments to be printed
    */
  def PrintArray(args : Array[String]) : Unit = {
    if (args.length > 0) {
      println(args.head)
      PrintArray(args.tail)
    }
  }

  def Hello() : String = {
    val Hello = "Hello"
    Hello
  }

  def doSecretMaramaLogic(): Unit = {
    d.doLogic()
  }
}
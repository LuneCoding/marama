package editor

class EditorThread extends Thread {

  override def run(): Unit = {
    println("Editor: Thread started!")

    //io.Source.stdin.getLines()

    val in = scala.io.StdIn
    var msg = in.readLine()
    while (false || !msg.equals("quit") && !msg.equals("stop")) {
      Thread.sleep(10)


      msg = in.readLine()
    }
    println("Editor: Goodbye.")
  }
}

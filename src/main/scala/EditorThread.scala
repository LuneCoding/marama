package editor

import java.util.concurrent.{ArrayBlockingQueue, BlockingQueue}

class EditorThread extends Runnable {
  var requests : BlockingQueue[String] = new ArrayBlockingQueue[String](5)
  var answers : BlockingQueue[String] = new ArrayBlockingQueue[String](5)

  def run: Unit = {
    println("Editor: Thread started!")
    var msg : String = ""

    while (!msg.equals("quit") && !msg.equals("stop")) {
      Thread.sleep(10)
      if (msg == null || msg.isEmpty) {
        msg = requests.take()
      }

      // Echo and print received message for clarification.
      if (msg != null) {
        println("Editor: Received request - {0}", msg)
        answers.add(msg)
      }

      // other message handling logic goes here

      // Clear the msg so a new one can be received next iteration.
      msg = ""
    }
    println("Editor: Goodbye.")
  }
}

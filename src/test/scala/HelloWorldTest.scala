package helloscala

import org.scalatest.funsuite.AnyFunSuite

class HelloWorldTest extends AnyFunSuite {

  test("HelloWorld should print 'Hello, World!'") {
    assertResult("Hello, World!") {
      val stream = new java.io.ByteArrayOutputStream()
      Console.withOut(stream) {
        HelloWorld.main(Array.empty)
      }
      stream.toString.trim
    }
  }
}
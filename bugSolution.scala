```scala
class MyClass(val name: String, val value: Int) {
  require(value >= 0, "Value cannot be negative") // Input validation
}

object Main extends App {
  val myObject = new MyClass("MyObject", 10)
  println(myObject.value) // prints 10
  // myObject.value = -5 // This is now a compile-time error, preventing accidental modification
}
```
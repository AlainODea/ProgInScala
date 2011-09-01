class Cell[+T](init: T) {
  private[this] var current = init
  def get = current
  def set(x: T) { current = x}
}

/* Cell[+T] would be bad because the following would cause ClassCastExceptions
val c1 = new Cell[String]("abc")
val c2: Cell[Any] = c1
c2.set(1)
val s: String = c1.get
*/

/* In fact, the Scala compiler forbids compiling Cell[+T] as follows:
Cell.scala:5: error: covariant type T occurs in
contravariant position in type T of value x
   def set(x: T) = current = x
*/
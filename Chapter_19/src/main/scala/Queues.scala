/* won't compile
class StrangeIntQueue extends Queue[Int] {
  override def enqueue(x: Int) = {
    println(math.sqrt(x))
    super.enqueue(x)
  }
}
*/

/*Won't compile
class Queue[+T] {
  def enqueue(x: T) =
   ...
}
Queues.scala:11: error: covariant ype T occurs in
contravariant position in type T of value x
  def enqueue(x: T)
              ^
*/

/*
These won't compile for a simple reason:
Method parameters are contravariant,
therefore having type parameter T as a method parameter precludes the
ability to make T covariant as it would create a type conflict.
*/
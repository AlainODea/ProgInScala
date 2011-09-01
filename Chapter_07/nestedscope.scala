/*
val a = 1
val a = 2 // Does not compile
println(a)
*/

val a = 1;
{
  val a = 2 // Compiles just fine
  // Scala allows shadowing
  // My guess is it allows it because otherwise nested function defs would be
  // painful because you would have to manually mangle their argument names
  println(a)
}
println(a)

val b = 1;
{
  val b = 2;
  {
    println(a)
  }
}

// overall these are confusing code examples due to name reuse.
// As I mentioned above this feature's primary purpose  seems to be to make
// argument naming in nested function defs more flexible

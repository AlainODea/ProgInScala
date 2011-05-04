package bobsrockets
package fleets
class Fleet {
  // Doesn't compile! Ship is not in scope.
  def addShip() { new Ship }
}
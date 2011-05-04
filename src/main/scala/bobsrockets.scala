package bobsrockets {
  class Ship
}

package bobsrockets.fleets {
  class Fleet {
    // Doesn't compile! Ship not in scope.
    def addShip() { new Ship }
  }
}

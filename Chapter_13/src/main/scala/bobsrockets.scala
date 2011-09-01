package bobsdelights

package navigation {
  private[bobsdelights] class Navigator {
    protected[navigation] def useStarChart() {}
    class LegOfJourney {
      private[Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
}
package launch {
  import navigation._
  object Vehicle {
    private[launch] val guide = new Navigator
  }
}

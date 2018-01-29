package org.scaia.solver.hedonic

import org.scaia.hedonic.{Game, Matching}
/**
  * Abstract class for solving a hedonic game
  */
abstract class HedonicSolver(game: Game) {
  var debug = false

  def solve() : Matching
}

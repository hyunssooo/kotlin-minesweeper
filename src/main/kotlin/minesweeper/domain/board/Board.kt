package minesweeper.domain.board

import minesweeper.domain.position.Position
import minesweeper.domain.tile.Tile

data class Board(val elements: Map<Position, Tile>) {
    init {
        require(elements.isNotEmpty())
    }
}

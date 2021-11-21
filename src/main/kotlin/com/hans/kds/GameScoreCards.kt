package com.hans.ds

data class GameEntry(val name: String, val score: Int)

class ScoreCard(private val capacity: Int) {
    private var numEntries = 0
    private var board: Array<GameEntry?> = Array(size = capacity) { null }

    fun add(entry: GameEntry) {
        val newScore = entry.score
        if(numEntries < board.size || newScore > board[numEntries - 1]!!.score) {
            if(numEntries < board.size)
                numEntries++
            var j = numEntries - 1
            while (j > 0 && board[j - 1]!!.score < newScore) {
                board[j] = board[j - 1]
                j--
            }
            board[j] = entry
        }
    }
}
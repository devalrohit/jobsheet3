package com.example.game_suit

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSOR" to true,
        "ROCK-PAPER" to false,
        "SCISSOR-PAPER" to true,
        "SCISSOR-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSOR" to false
    )

    private val options = listOf("ROCK", "SCISSOR", "PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.rock,
        "SCISSOR" to R.drawable.scissor,
        "PAPER" to R.drawable.paper
    )

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionDrawable[option] !!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"] ?: false
}

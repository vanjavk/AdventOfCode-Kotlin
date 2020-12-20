package me.vanjavk

import kotlin.reflect.typeOf

class Day01(private val input: String) {
    init {
        println("Day 1 - part 1: ${part1()}")
//        part2()
    }

    private fun part1(): Int {
        val complementaryMap = mutableMapOf<Int, Int>()
        input.lines().map {
            it.toInt().also { complementaryMap[2020 - it] = it  }
        }.forEach {
            if (complementaryMap.containsKey(it)) return it*(2020-it)
        }
        return -1
    }
}

//            return@map
//        }.let {
//            if (complementaryMap.containsKey(it)) return it
//        }

//        complementaryMap.forEach{k,v->println(k)}
//    .let {
//        println(it)
//        it.forEach {
//            println(it)
//            if (complementaryMap.containsKey(it)) return it }
//    }


//        fun getResult(): Pair<Int, Int> {
//            numbers.forEach { if (complementSum[it]?.plus(it) == 2020) }
//        }

//        numbers.let { if (complementSum[it]?.plus(it) == 2020) {return it }}

//println(numbers)





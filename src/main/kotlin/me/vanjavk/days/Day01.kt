package me.vanjavk.days


class Day01(private val input: String) {
    init {
        println("Day 1 - part 1: ${part1()}")
        println("Day 1 - part 2: ${part2()}")
//        part1()
//        part2()
    }

    private fun part1(): Int {
        val complementaryMap = mutableMapOf<Int, Int>()
        return input.lines().map {
            it.toInt().also { complementaryMap[2020 - it] = it }
        }.first {
            complementaryMap.containsKey(it)
        }.let { it * (2020 - it) }
    }

    private fun part2(): Int {
        val numbers = input.lines().map { it.toInt() }.sorted()
        val count = numbers.size - 1
        var left = 0
        var right = count
//        println(numbers)
        while (true) {
            for (middle in left + 1 until right - 1) {
                val sum = numbers[left] + numbers[middle] + numbers[right]
//                println("$left $middle $right $sum ${numbers[left]} ${numbers[middle]} ${numbers[right]}")
                when {
                    sum == 2020 -> return numbers[left] * numbers[middle] * numbers[right]
                    sum > 2020 -> {
                        right--; break
                    }
                    sum < 2020 && middle + 1 == right -> {
                        left++; break
                    }
                }
            }
        }
    }


    private fun part1BAD(): Int =
        input.lines().map { it.toInt() }.sorted().run {
            mapIndexedNotNull { _, a ->
                this.firstOrNull { a + it == 2020 }
                    ?.let { a * it }
            }.first()
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





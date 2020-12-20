import java.io.File

val numbers = mutableListOf<Int>()

fun main() {

    File(Resources.javaClass.classLoader.getResource("day01.txt").toURI()).forEachLine
    {
        numbers.add(it.toInt())
    }

    val complementSum = mutableMapOf<Int, Int>()

    numbers.forEach { complementSum[it] = 2020 - it }

    println(complementSum[1717])
//        fun getResult(): Pair<Int, Int> {
//            numbers.forEach { if (complementSum[it]?.plus(it) == 2020) }
//        }

//        numbers.let { if (complementSum[it]?.plus(it) == 2020) {return it }}

    //println(numbers)
}


}

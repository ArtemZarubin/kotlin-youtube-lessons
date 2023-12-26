//Lesson 1: Getting started
fun main() {
    // This is comment
    // println("Hello World!")

    // Lesson 2: Variables
    var benchPressMax: Int = 80 // KG of course
    val nameOfTheGym = "Olympia"

    println("I bench $benchPressMax kg at gym $nameOfTheGym!")

    benchPressMax = 100
    println("Now I can easily bench $benchPressMax")    // Everything is true

    // Integers
    val longNum: Long = 7620133724512521551 // 64 bit
    val intNum: Int = 247344274 // 32 bit
    val shortNum: Short = 4562  //  16 bit
    val byteNum: Byte = 127 // 8 bit
    val unsignedInt: UInt = 7620U   // Favorite number, and also it's only positive values with such type

    // Real numbers
    val doubleNum: Double = 3.1415926535    // 64 bit
    val floatNum: Float = 56.78f    // 32 bit

    // Strings and characters
    val stringOfLetters: String = "abcdefghijklmnopqrstuvwxyz"
    val onlyOneChar: Char = 'W'

    // Boolean
    val doYouBelieveMe:Boolean = true   // Which means 'yes'
    val itsPython: Boolean = false  // No, its Kotlin
}



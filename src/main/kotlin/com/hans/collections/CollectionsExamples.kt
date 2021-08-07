package com.hans.collections

import java.io.InputStream
import java.net.URI

data class Person (
    val name: String,
    val age: Int,
    val hasDriverLicense: Boolean = false
)


class CollectionsExamples {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val friends = listOf<Person>(
                Person("Harish", 30),
                Person("Satti", 29),
                Person("Chaithu", 30, true),
                Person("Anand", 13)
            )
            friends.any {it.hasDriverLicense}.also(::println)
            friends.none {it.age < 18}.also { println("None on friends : $it") }
            friends.all { it.name.length > 4 }.also { println("All names length is > 4: $it") }

            // any, none, all on empty list
            val emptyGroup = emptyList<Person>()
            emptyGroup.any{ it.hasDriverLicense }
                .also { println("Any on empty list: $it") }
            emptyGroup.none { it.age > 18 }
                .also { println("None on empty list is always: $it") }
            friends.all { it.name.length > 4 }
                .also { println("All names length is > 4 on empty list is always: $it") }

            // Creating chunks from single list
            val objects: List<String> = listOf("A", "B", "C", "D", "E", "F", "G", "H")
            objects.chunked(3).also { println("Chunked List : $it") }

            // Reverse the chunks
            objects.chunked(3){ it.reversed() }
                .also { println("Reversed chunks :: $it") }

            // Windowed
            objects.windowed(3, 2, false)
                .also { println("Windowed list :: $it") }
            // Windowed till end
            objects.windowed(3, 2, true)
                .also { println("Windowed list partial :: $it") }

            // Windowing and flatten
            objects.windowed(3, 2, true)
                .flatten().also { println("Flatten windowed list: $it") }

            // Converting Strings of list in to list of characters
            listOf<String>("Harish", "Sai", "Gradle")
                .flatMap { it.toList() }.also { println("list of characters from list of strings: $it") }

            // Zipping to lists to form pairs(List of Map)
            val states = listOf<String>("Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu", "Orissa")
            val stateCodes = listOf<String>("AP", "KA", "KL", "TN", "OR", "UP")
            val stateAndZipPairs: List<Pair<String, String>> = states.zip(stateCodes).also { println("Zipping to list to form pairs: $it") }
            (states zip stateCodes).also { println("Zip without function call : $it") }

            // Zipping and mapping
            val statesWithCodes = states.zip(stateCodes) { state, code -> state.uppercase() to code.lowercase()}
            println("States with codes transformed to upper and lower case: $statesWithCodes")

            // Unzipping to separate lists
            val unzipList: Pair<List<String>, List<String>> = statesWithCodes.unzip()
                .also { println("Unzip the list of pairs:: $it") }

            // Destructuring zip to separate list
            val (stateList: List<String>, codeList: List<String>) = unzipList;
            println("StateList from destructuring: $stateList")
            println("CodeList from destructuring: $codeList")

            // zipWithNext
            val numbers = listOf<Int>(3, 4, 5, 2, 1, 9, 6, 8, 7)
            numbers.zipWithNext().also { println("Zip with next on numbers list :: $it") }
            numbers.zipWithNext { a, b -> b - a}
                .also { println("Transforming pairs to list of differences: $it") }

            // Average and sum of numbers in a list
            numbers.average().also { println("Average of numbers : $it")}
            numbers.sum().also { println("Sum of numbers : $it") }

            // Reduce to aggregate
            numbers.reduce { acc, i -> acc * i  }.also { println("Multiplied : $it") }

            // fold to specify our own accumulator
            val fruits: List<String> = listOf("apple", "cherry", "banana", "orange")
            fruits.fold(0) {acc: Int, s: String -> acc + s.length }
                .also { println("Sum of fruits length:: $it") }

            fruits.runningFold(1) { acc: Int, s: String ->  acc * s.length }
                .also { println("Running fold of fruit names :: $it") }

            val (one: Int, two: Int) = numbers
            println("Destructuring list : $one - $two")

            val (name: String) = Person("GHK", 30, true)
            println("Destructuring Object : $name")
        }
    }

}
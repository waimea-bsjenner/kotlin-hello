/**
 * this is a comment (or is it? *Vsauce music plays*)
 */


/**
 * The main function in the entry
 * point to any kotlin program
 */
fun main() {
    // We can output to the terminal
    // with print() and println()
    println("Sup Terra!")
    print("Sup")
    print(" ")
    print("Terra!")
    println()
    // Strings are concatenated with a +
    println("Sup" + " " + "Terra!")
    // In kotlin, there are two types of variables
    // If a variable will never change (immutable) we use val, for value
    val Val = "genericVal"
    val dob = "sep 11 2001"
    val name = "Morgan"
    // If a variable will change (mutable) we use var, for variable
    var height = 69420
    var dtdTeacher = "Steve"
    // variable names should ALWAYS start with a lowercase letter (optional)
    val numLegs = 2 // good
    val NumLegs = 3 // BAD!!!!!! (also wtf)

    // Multiple words in a variable should have a capital EXCEPT for the first
    val speciesofbrother = "Indian" // BAD!!!!!!
    val speciesOfBrother = "Brother" // good. this is called CamelCase
    val species_of_brother = "Sister" // acceptable but camelcase is superior. This is called SnakeCase


    // STRING TEMPLATES =======================================================================================================

    // we often want to output variable values with text

    println("My name is " + name) // using concatenation

    println("My name is $name") // using a template
    println("I have $numLegs legs")
    println("I have ${numLegs * 4.5} Toes")


    //STRING MANIP ============================================================================================

    println(name.uppercase())
    println(name.lowercase())

    val scoreText =  "1000" // the 1000 is a string instead of a number value because its in the "", so we cant treat it like a number
    val score = scoreText.toInt() //this function transforms the string into an integer meaning we can math it now
    println("Score: $score")

    val testText = "goat"
    val textNum = testText.toIntOrNull() // this copes with trash inputs
    println(textNum)

    //USER INPUT ===============================(ohgod)======================================================================

    println("enter your favorite color (if it isnt red then i will send 5 mr copleys to ur house and steal ur legos)")
    val colour = readln()
    if (colour == "red") {
        println("thats the correct option")
    }

    else {
        println("trash")
    }
    println("enter your favorite number")
    val number = readln().toIntOrNull()
    when (number) {
        null -> println("nice number (its not a number)")
        727 -> println("WYSi")
        69 -> println("nice")
        else -> println("how intriguing")
    }

    // LOOPING/ITERATION =====================================================================================================

    // while loops
    var count = 0
    while (count < 10) {
        println(count)
        count++
    }
    // infinite void- i mean infinite loop
    while (true) {
        println("what is popping gang. type 'x' to exit")
        val input = readln()
        if (input == "x") break
    }

    // 'for range' loops
    for (num in 1..10)
        print(num)
}
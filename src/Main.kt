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
}
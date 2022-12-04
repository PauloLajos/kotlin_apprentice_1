import kotlin.math.*

// This is a comment. It is not executed.

// This is also a comment. 
// Over multiple lines. 

/* This is also a comment. 
Over many.. 
many... 
many lines. */

/* This is a comment. 
/* And inside it 
is 
another comment. 
*/ 
Back to the first. 
*/

println("Hello, Kotlin Apprentice reader!")
println("%.0f".format(28.0 % 10.0))

println("%.2f".format(sin(45 * PI / 180)))
// 0.7071067811865475 
println("%.3f".format(cos(135 * PI / 180)))
// -0.7071067811865475

val number: Int = 10
val pi: Double = 3.14159

var variableNumber: Int = 42
variableNumber = 0 
variableNumber = 1_000_000

var counter: Int = 0 
counter += 1 
// counter = 1 
counter -= 1 
// counter = 0

counter = 10 
counter *= 3 // same as counter = counter * 3 
// counter = 30 
counter /= 2 // same as counter = counter / 2 
// counter = 15


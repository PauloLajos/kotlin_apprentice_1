var integer: Int = 100 
var decimal: Double = 12.5 
//integer = decimal

integer = decimal.toInt()

val hourlyRate: Double = 19.5 
val hoursWorked: Int = 10 
val totalCost: Double = hourlyRate * hoursWorked

val characterA: Char = 'a'

//val stringDog: String = "Dog"
val stringDog = "Dog" 
// Inferred to be of type String

var message = "Hello" + " my name is " 
val name = "Dick" 
message += name 
// "Hello my name is Dick"
val exclamationMark: Char = '!' 
message += exclamationMark 
// "Hello my name is Dick!"

message = "Hello my name is $name!" // "Hello my name is Dick!"

val oneThird = 1.0 / 3.0 
val oneThirdLongString = "One third is $oneThird as a decimal."
val oneThirdLongString2 = "One third is ${1.0 / 3.0} as a decimal."

val bigString = """ 
|You can have a string 
|that contains multiple 
|lines 
|by 
|doing this. 
""".trimMargin() 
println(bigString)

//edited with spacevim


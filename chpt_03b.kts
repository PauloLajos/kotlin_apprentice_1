val coordinates:Pair<Int, Int> =Pair(2, 3)
println(coordinates)

val coordinatesInferred = Pair(3, 4)

val coordinatesWithTo = 5 to 6
val coordinatesDoubles = Pair (2.1, 3.4)
val coordinatesMixed = Pair (3.2, 4)
val x1 = coordinates.first
println("coordinates second: ${coordinates.second}")

val (x, y) = coordinates
println("x: $x")

val coordinates3D = Triple(2, 3, 4)
val (x3, y3, z3) = coordinates3D

val (x4, y4, _) = coordinates3D
//This line of code only declares x4 and y4. The _ is special and simply means you’re ignoring this part for now.



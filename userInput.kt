/*
	Using Kotlin to get user input

*/

fun main(){

	print("Enter name: ")

	val userInput = readLine()!!

	println("Hello $userInput")

	println("What would you like to do today?\n1: Run When.jar\n2: exit")
	var userInput2 = readLine()!!

	val display = when(userInput2.toInt()){

			1 -> "Try to call java -jar when.jar "
			else -> "Exiting... Have a great day"

		}
	println(display)

	//COMPILE: kotlinc userInput.kt -include-runtime -d userIn.jar
	//RUN: java -jar userIn.jar

}
//Successfully completed!

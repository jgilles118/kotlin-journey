/*	IF_Else-Switch statements use the WHEN keyword
	
	Reviewing so far, it appears that the known Switch/Case format used
	in Java has a different format in Kotlin.
	
	Review code for clarity

*/

fun main(){

	print("Enter a value in range 1 - 6: ")
	
	//First: receive the requested character as a string
	var userIn = readLine()!!
	
	//Convert the string userIn1 variable to an integer
	val display = when (userIn.toInt()) {

		1 -> "One for the money!"
		2 -> "Two for the show!"
		3 -> "Three to get ready!"
		4 -> "on four Let\'s go!"
		5 -> "Staying alive at five!"
		6 -> "Now at six, pick up sticks"
		else -> "Your entry is not in range dummy!\nBYEEE!"
	}
	println(display)

}

//COMPILE: kotlinc When.kt -include-runtime -d when.jar
//RUN: java -jar when.jar

//Received a compile error. will continue later.
//Fixed by converting the string variable to integer. No Java Scanner util needed


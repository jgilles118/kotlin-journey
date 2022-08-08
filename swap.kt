/*
	Perform a swap using 2 variables only

*/
import java.util.Scanner

fun main(args : Array<String>){
	
	val sysIn = Scanner(System.`in`)
	
	print("Enter the first value: ")
	var x = sysIn.nextInt()

	print("\nEnter the second value: ")
    var y = sysIn.nextInt()

	println("Your values before the swap x = $x and y = $y")
	
    //Swapping mathematics technique
	try{	
		x = x + y;
		y = x - y;
		x = x - y;
	}
	catch(e: ArithmeticException){ println("Swapping error") } 
	
	println("Your values after swap is x = $x and y = $y")

}

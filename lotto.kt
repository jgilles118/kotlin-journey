/*
 *  Mega Lottery Picks
 *
 * */
import kotlin.random.Random

 fun main(args: Array<String>){

	//Need six random number generators
	val pix1 = List(5) { Random.nextInt(1, 70)}
	val pb1 = (1..25).random()
	val pix2 = List(5) { Random.nextInt(1, 70)}
	val pb2 = (1..25).random()
	val pix3 = List(5) { Random.nextInt(1, 70)}
	val pb3 = (1..25).random()
	val pix4 = List(5) { Random.nextInt(1, 70)}
	val pb4 = (1..25).random()
	val pix5 = List(5) { Random.nextInt(1, 70)}
	val pb5 = (1..25).random()
	val pix6 = List(5) { Random.nextInt(1, 70)}
	val pb6 = (1..25).random()
	//Show me the winners
	for(i in 1..6){
		when(i){
			1 -> println("$pix1, $pb1")
			2 -> println("$pix2, $pb2")
			3 -> println("$pix3, $pb3")
			4 -> println("$pix4, $pb4")
			5 -> println("$pix5, $pb5")
			6 -> println("$pix6, $pb6")

		}
	}


}

//kotlinc lotto.kt -include-runtime -d lotto.jar
//java -jar lotto.jar
//Play at your own risk - Planet Rock	:


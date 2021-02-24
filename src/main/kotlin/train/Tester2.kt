package train

import java.util.*



fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticket = scanner.nextInt()
    println("Please enter number of round: ")
    var round = scanner.nextInt()
    val total = Tester2(ticket,round)
    total.println()

}

class Tester2 (var ticket:Int,var round:Int){
    fun println(){
        println("Total tickt:"+ticket+"\t"+"Round-trip"+round+"\t"+"Total"+"\t"+((ticket-round)*1000+ round*2000*0.9))
    }
}
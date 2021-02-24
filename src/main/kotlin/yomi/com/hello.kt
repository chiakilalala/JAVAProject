package yomi.com


fun main(args: Array<String>) {
    var s:String? ="abcde"
    s =null
    println(s!!.length)
    println(s.get(3))
    println(s.substring(3))
    //Human().hello()
    val h = Human(66.5f,1.7f)
    println(h.bmi())
//    h.hello()
//    val age =19
//    var weight= 66.5f
//    var name :String
//    name ="Hank"




}
class Human(var weight:Float,var height:Float,var name:String=""){
    init {
        println("test${weight}")
    }

    fun bmi():Float{
        val bmi = weight/(height*height);
        return bmi
    }
    fun hello(){
        println("hello kotilin")
    }
}
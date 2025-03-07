fun main() {
    var fullname : String = "Jennifer Nyambura Muriuki"
    var age : Int =  17
    var phonenumber : String = "0702123456"
    var weight : String = "50.7kg"
            var citizen : Boolean = true
    println("Name:" +fullname)
    println("Age:" +age)
    println("Phonenumber:"+phonenumber)
    println("Weight:" +weight)
    println("Kenyan:" +citizen)
    printlnName("Ada")
    var result = modulus(90,7)
    println(result)

//    var result = add(3,6,8,1)
//    println(result)
    printlnself()

}
    fun studentData(fullname: String, age: Int, phonenumber:String, weight:String, citizen:Boolean){

    }
fun printlnName(name: String){
    println("Hello $name" )
}
fun modulus(num1:Int,num2:Int):Int{
//    var num1 = 90
//    var num2 = 7
    var remainder = num1 % num2
    return remainder

}
fun add(a:Int, b:Int, c:Int, d:Int):Int{
    var a = 2
    var b = 4
    var c = 6
    var d = 8
    var sum =a + b + c + d
    return sum
}
fun printlnself(){
    println("I am a fun person wait until you make me back off I won't resist in fact I do it with pleasure." )/    var a = 2
//    var b = 4
//    var c = 6
//    var d = 8
}

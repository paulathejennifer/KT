fun main() {
    printBestFriend("Ojo")
    printBestFriend("Jenn")
    multiply(6, 5)
    substract(5,7)
//    var result = substract(5,7)
//    println(result)
    var result = calcAvAge(5, 10, 15)
    println(result)


}


fun divide(){
    var x = 23.4
    var y = 5
    x/=y
    println(x)

}

fun add(){
    var a = 1
    var b = 2
    var c = 3
    a=b+c
    println(a)
}

fun multiply(x:Int, y:Int) {
//    var x = 34
//    var y = 42
    var product = x * y
    println(product)
}
fun printBestFriend(bestie: String){
    println("My best friend is " +bestie)
}

fun substract(num1:Int,num2:Int):Int{
    var difference= num1-num2
    return difference
}
fun calcAvAge(age1: Int, age2: Int, age3: Int): Double{
    val avg = (age1+age1+age3)/3.0
    return avg
}



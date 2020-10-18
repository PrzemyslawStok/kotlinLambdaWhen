import java.lang.Math.exp

fun main(){
    printA(5)

    //x-e^(-x) = 0
    //4x+sin(x) = 0

    val array = listOf(1,2,3,4,5,6,7,8,9,10)
    var square:(Int)->Int = {x:Int->x*x}

    val add = {a:Int,b:Int->a+b}
    val sub = {a:Int,b:Int->a-b}
    val equation = {x:Double->x-exp(-x)}

    val div:(Int,Int)->Double = {x:Int,y:Int->x/y.toDouble()}

    println("kwadrat wynosi: ${square(5)}")
    println("suma wynosi ${add(2,5)}")
    println("iloraz wynosi ${div(2,5)}")

    println(array)
    println(array.map(square))
    println(array.map{x:Int->x*x})
    println(array.map{it*it})
}

fun add1(a: Int, b: Int):Int{
    return a+b
}

fun printA(a: Int) = println("Wartość wynosi ${a}")

fun math(a:Int, b:Int):Double{
    return 0.0
}

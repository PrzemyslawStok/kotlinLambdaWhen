import java.lang.Math.abs
import java.lang.Math.exp

fun main(){
    printA(5)

    //x-e^(-x) = 0
    //4x+sin(x) = 0

    val array = listOf(1,2,3,4,5,6,7,8,9,10)
    val square:(Int)->Int = {x:Int->x*x}

    val add = {a:Int,b:Int->a+b}
    val sub = {a:Int,b:Int->a-b}

    println(math(2,4,add))
    println(math(2,4,sub))

    println(math(2,5){a,b->a*b})

    val div:(Int,Int)->Double = {x:Int,y:Int->x/y.toDouble()}

    println("kwadrat wynosi: ${square(5)}")
    println("suma wynosi ${add(2,5)}")
    println("iloraz wynosi ${div(2,5)}")

    println(array)
    println(array.map(square))
    println(array.map{x:Int->x*x})
    println(array.map{it*it})

    val equation = {x:Double->x-exp(-x)}

    printEquation(2.0,equation)
    printEquation(2.0){x->x+1}

    checkEquation(2.0,5.0){5.001}
    checkEquation(2.0,3.0){x->x+1}

    println(exp(5.0)-148.41315)
}

fun add1(a: Int, b: Int):Int{
    return a+b
}

fun printA(a: Int) = println("Wartość wynosi ${a}")

fun math(a:Int, b:Int,f:(Int,Int)->Int):Int{
    return f(a,b)
}

fun printEquation(x: Double, equation: (Double)->Double){
    val result = equation(x)
    println("x=${x} , wynik ${result}")
}

fun checkEquation(x: Double, y:Double, f: (Double)->Double){
    //y powinno być równe f(x) albo wieksze od epsilon
    //epsilon = 0.00001

    if(abs(y-f(x))<0.00001)
        println("Wynik się zgadza")
    else
        println("Wynik nie zgadza się: ${abs(y-f(x))} > 0.00001")

}

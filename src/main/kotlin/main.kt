fun main(){
    printA(5)

    //x-e^(-x) = 0
    //4x+sin(x) = 0

    val array = listOf(1,2,3,4,5,6,7,8,9,10)
    val square = {x:Int->x*x}

    println("kwadrat wynosi: ${square(5)}")

    println(array)
    println(array.map(square))
}

fun add(a: Int, b: Int):Int{
    return a+b
}

fun printA(a: Int) = println("Wartość wynosi ${a}")


fun main() {

 var names = strings("Pauline", "paul")
    println(names)

    // for the data class
    var results = numbers(arrayOf(23,45,1))
    println(results)

    // for spliting the string
    country("R,w,a,n,d,a")

    // for the array string
    var sentence = petsName(arrayOf("Bole", "Max", "Guy"))
    println(sentence)


    // for class calculator
    val calculator = Calculator(1,2,3,4,5 )

       // addition
    calculator.addition()

    // subtraction
    calculator.subtraction()

    // division
    calculator.division()

    // multiplication
    calculator.multiplication()

}

// 1. Function that takes in strings and prints the first letter
fun strings(name1: String, name2: String): String{
    if(name1.length >= name2.length || name1.length == name2.length ){
        return name1[0].toString()
    }
    else{
        return (name1[0].toString())
    }

}

// 2.Function that takes in array

data class List(var smallest: Int, var largest: Int, var average: Double)

fun numbers(lists: Array<Int>): List{

    var small = lists.min()
    var large = lists.max()
    var aver = lists.average()

    var result = List(small, large, aver)
    return result
}

// 3.Function that takes in a function and split it

fun country(country: String){
    println(country.split(","))
}

// 4. Function that takes in array of strings and joiin them into one

fun petsName(pets: Array<String>): String{
    var pet = pets.toString()
    return pet.toString()

}


// 5. Calculator class

class Calculator(var numb1: Int, var numb2: Int, var numb3: Int, var numb4: Int, var numb5: Int){

    // addition
    fun addition(){
        println("addition: ${numb1 + numb2}")
    }

    // subtraction
    fun subtraction(){
        println("subtraction: ${numb5 - numb4}")
    }

    // division
    fun division(){
        println("Division: ${numb4 / numb4}")
    }

    // multiplication
    fun multiplication(){
        println("Multiplication: ${numb5 * numb3}")
    }

}
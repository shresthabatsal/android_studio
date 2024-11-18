package com.example.myapplication

fun main(){

    var data = mapOf(
        "sit" to "to not stand",
        "stand" to "to not sit"
    )
    println("Enter a word:")
    val input : String = readln()
    println(data[input])

//    print("Enter a day of the week:")
//    var dayNumber:Int = readln()!!.toInt()
//    var day:String
//    when(dayNumber){
//        1 -> day = "Sunday"
//        2 -> day = "Monday"
//        3 -> day = "Tuesday"
//        4 -> day = "Wednesday"
//        5 -> day = "Thursday"
//        6 -> day = "Friday"
//        7 -> day = "Saturday"
//        else -> day = "Invalid day choice"
//    }
//    println(day)

//    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
//
//    vehicle.forEach {
//        println(it)
//    }
//

//    fun add(a: Int, b: Int): Int {
//        var sum = 0
//        sum = a + b
//        return sum
//    }
}
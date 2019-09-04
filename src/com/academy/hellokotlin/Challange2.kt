package com.academy.hellokotlin

import com.google.gson.Gson


fun main(args: Array<String>) {

//    val floatNumner= 23.34F
//    var number2: Float= 23.3F
//
//
//    var number3: Float?= 23.3F
//
//    var shortArray: Array<Short> = arrayOf(2,3,4,4)
//
//    val nullableInt= Array<Int?>(40){i->(i+1)*5}
//    for(numer in nullableInt)
//    {
//        print("${numer} ")
//    }
//
//    val charArry: Array<Char>  = arrayOf('a','b','c')
//    CharArray().method(charArry.toCharArray())
//
//    val x: String? ="Hi, My name is khan!"
//
//    val x2: String= x?.toLowerCase()?:"asda"

    val emp: Employee = Employee("Ashok", false)
//    println("${emp.name}, ${emp.value}")
//val adb= listOf(emp)
//
    val res= with(emp){
    }
    println(res.javaClass)


    val result2= emp.apply {
    }

    println(result2.javaClass)

//
//    val lis= mutableListOf<Int>(12,12,23,34)
//        Test().changeList(lis)
//    println("szize of list ${lis.size}")
//
//    val list1= listOf("Ashok","Ram","Vishnu")
//    val list2= listOf("Ram","ads","asda")
//
//      val asd= arrayOf("asd","asd","Asdas")
//    println(listOf(list1,list2))
//    println(list1.zip(list2))
//    println(listOf(asd))
//    println(listOf(*asd))
//    println(list1+list2)
//
//    val dEmp= DestrucutingEmployee("ASd",false);
//
//    val(s, d)= dEmp
//    println(s)
//    println(d)
//
//    val mapp= mapOf(1 to 10, 2 to 20)
//    for ((K,V) in mapp)
//    {
//        println(K)
//        println(V)
//    }
//

    val mutableSet= mutableSetOf(1,2,3,4,5,6)
    println(mutableSet.filter { it>2 })
    println(mutableSet.find {it> 10})

}

data class Employee(val name: String, var value: Boolean) {
}


class DestrucutingEmployee(val name: String, var value: Boolean) {


    operator  fun component2()= value
    operator  fun component1()= name
}
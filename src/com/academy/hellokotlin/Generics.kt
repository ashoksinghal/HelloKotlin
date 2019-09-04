package com.academy.hellokotlin


fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 10)

//    val(fname, lname,age)= joe
//    println("fname $fname, lastname=$lname, and age= $age")


    val jane = Person("Jane", "Marshell", 20)
    val jia = Person("Jia", "Jonshan", 30)
    val joye = Person("Joye", "Jinna", 40)

    val mutableMap = mutableMapOf<String, Person>(joe.lastName to joe, jane.lastName to jane, jia.lastName to jia, joye.lastName to joye)

    //println(mutableMap.filterValues { person -> person.lastName.endsWith("s") }  )
    println(mutableMap.filter { it.value.lastName.endsWith("s") }.count())


    //println(mutableMap.map { Pair(it.value.firstName,it.value.lastName) })
    val fNames = mutableMap.map { it.value.firstName }
    val lastName = mutableMap.map { it.value.lastName }
    val pairs = fNames.zip(lastName)
    println(pairs)


//    mutableMap.also {it.values.forEach {
//        println("${it.firstName} is ${it.age} years old")
//    } }


    mutableMap.also {
        it.map {
            println("${it.value.lastName} is ${it.value.age} years old")
        }
    }

    val list1 = listOf(1, 3, 4, 5, 7, 8, 8, 9)
    val list2 = listOf(3, 4, 34, 554, 6678)
//    println(list1.filter { list2.contains(it) })
    println(list1.filter { it in list2 })


    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()

    paper = regularPaper


}

/*data*/   class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}


class Box<in T> {

    fun asd(asd: T)
    {

    }

    fun asdsad(): T
    {

    }

}

open class Paper {

}


class Regular : Paper() {

}

class Premium : Paper() {

}

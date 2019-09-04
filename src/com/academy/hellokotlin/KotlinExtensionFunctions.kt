package com.academy.hellokotlin

fun main(args: Array<String>) {

//useLet()
//    nestingLet()
//    userRun()
//    useRunAndLet()
//    userAlso()

//    userLetAndAlso()
//    useApply()

//applyAndAlso()

    userWith()

}

/**
 * default returns Unit or whatever written there in the last
 */
fun userWith() {
    data class Person(var name: String, var tutorial : String)
    var person = Person("Anupam", "Kotlin")

    val test= with(person)
    {
        name = "No Name"
        tutorial = "Kotlin tutorials"
        this
    }

    println(test)
}

fun applyAndAlso() {

    data class Person(var n: String, var t : String)
    var person = Person("Anupam", "Kotlin")

    person.apply { t = "Swift" }
    println(person)

    person.also { it.t = "Java" }
    println(person)
}


/**
 * apply and also are same, we get it in also and this in apply
 * returns the same object as also() function
 */
fun useApply() {
    data class Person(var name: String, var tutorial: String)

    var person = Person("Anupam", "Kotlin")

    person.apply { this.tutorial = "Swift" }
    println(person)

}

fun userLetAndAlso() {
    data class Person(var name: String, var tutorial: String)

    var person = Person("Anupam", "Kotlin")

    var l = person.let { it.tutorial = "Android" } //returning Unit as nothing is there to be returned or returns whatever is there in the last
    var al = person.also { it.tutorial = "Java" } // will return the same object

    println(l)
    println(al)
    println(person)
}


/**
 * this function just return the original object
 */
fun userAlso() {
    var m = 1
    m = m.also { it + 1 }.also { it + 1 }
    println(m) //prints 1
}

/**
 * run and let works same way and return Unit if nothing is there in the last statements, only different is that run doesn't have any it keyword
 */
fun useRunAndLet() {
    val abc = "tetsing".let { it + "asd".run { println(this) } }
    println(abc)

}

/**
 * run and let works same way and return Unit if nothing is there in the last statements, only different is that run doesn't have any it keyword
 */
fun userRun() {
    val returning = "asdasd".run { println(this) }
    println(returning)
}

/**
 * by default let returns Unit
 */
fun nestingLet() {
    val finalValue = "hello"?.let { it ->
        (it + "asdasd").let { innerit -> println("text fri $it and inner $innerit") }
    }
    println(finalValue)
}


fun useLet() {
    var str = "Hello World"
    str.let { println("$it!!") }
    println(str)
    println("strLength is ${str.length}") //prints strLength is 11

    var strLength = str.let { "$it function".length }
    println("strLength is $strLength") //prints strLength is 20

}

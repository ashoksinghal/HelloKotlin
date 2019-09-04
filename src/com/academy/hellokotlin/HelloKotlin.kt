package com.academy.hellokotlin



fun main(args: Array<String>) {

    val nonNummableFlaot = 243.2f



//    val nonNullFloat: Float = 234.3

    val arrayOfShort = shortArrayOf(1, 2, 3, 4, 5)
    val arrayOfShort2: Array<Short> = arrayOf(3, 5, 6, 7, 7)


    val nullableIntArray = Array<Int?>(4) { i -> i + 5 }



    val charArray = charArrayOf('a', 'b', 'c')
    val charArray2: Array<Char> = Array<Char>(3) { 'a' }
    DummyJava().charArrayJavaMethod(charArray)
    DummyJava().charArrayJavaMethod(charArray2.toCharArray())

    val x: String? = null
    val anotherString= x?.toLowerCase()?:"Myname is test"
    println(anotherString)

    anotherString.let {
        println( it.toLowerCase().replace("is","myname is khan"))}

//val         arrayOfShort= Array<Short>(5){i->i+1}

//    val hello1 = "Hello"
//    val hello2 = "Hello"
//
//    val tesingtest: Any = "Hey how are you?"
//    if (tesingtest is String) {
//        println(tesingtest.toUpperCase())
//    }
//
//    println("""1
//              |11
//             |111
//            |1111""".trimMargin())
//
//    var myInt = 123
//    var myLong = 243L
//    myInt = myLong.toInt()
//    println("the value of myInt is ${myInt is Int}")
//
//    var hgj:String?
//
//    hgj=null


//    println("Hello Kotlin")
//
//    val test1:HelloTest= HelloTest("Ashok",9958216640)
//    val test2:Any= HelloTest("Ashok",9958216640)
//    println(test1==test2)
//    println(test1===test2)
//
//
//    println("We are going to print the object ${test1.name} and ${test1.mobile}")

}

class HelloTest(val name: String, val mobile: Long) {
    override fun equals(other: Any?): Boolean {
        if (other is HelloTest) {
            if (name == other.name)
                return true
        }

        return super.equals(other)
    }
}
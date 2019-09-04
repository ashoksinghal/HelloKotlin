package com.academy.hellokotlin

fun main(args: Array<String>) {
    val list = listOf(1, 3, 4, 5, 6)
    iterateList(list)

    val floatList: MutableList<Float?> = mutableListOf(12.2F,12.23F,null,24.2F)
    floatList[0]=null
    iterateList(floatList)


//    val strList= listOf("Asho","asd","Asdasd","Asdas")
//    iterateList(strList)


    if(floatList is List<*>)
    {

    }


}

fun <T: Number?>iterateList(list: List<T>){
    for (item in list) {
        println(item)
    }
}
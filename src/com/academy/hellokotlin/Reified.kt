package com.academy.hellokotlin

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf ( "Hello", "Hi there",BigDecimal(12.233),"asdad",12354)

    val secondList= getitenList<Int>(mixedList)

    for (item in secondList)
        println(item)

}

inline fun <reified T> getitenList(hg: List<Any>): List<T> {

    val newList= mutableListOf<T>()
    for (listIem in hg)
    {
        if(listIem is T)
        {
            newList.add(listIem)
        }
    }
    return  newList

}

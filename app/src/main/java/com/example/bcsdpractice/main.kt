package com.example.bcsdpractice

fun main(){

    val list1 = listOf(1, 2, 3)
    val list2 = listOf(2, 3, 4)

    val list3 = list1.union(list2)
    println(list3) //It might be [1, 2, 3, 4]
}
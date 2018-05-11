package com.ericho.androidexampledemo.extension

infix fun <E> MutableList<E>.addOne(element: E): Unit {
    this.add(element)
}
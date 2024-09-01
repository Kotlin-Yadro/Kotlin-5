package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */

fun <K, V> Map<K, V>.swap(): Map<V, K> = map { (k,v) -> v to k }.toMap()

/*
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    var newMap = mutableMapOf<V, K>()
    forEach{ (k, v) -> newMap[v]=k}
    return newMap
}*/
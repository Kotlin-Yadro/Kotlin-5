package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val retMap: MutableMap<V, K> = mutableMapOf()

    forEach { (k, v) -> retMap[v] = k }

    return retMap
}
package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> =
    mapOf(*entries.map { (key, value) -> value to key }.toTypedArray())
package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> =
    sortedByDescending { it.age }

fun List<Person>.sortByAgeWithComparator(): List<Person> =
    sortedWith { p1: Person, p2: Person -> p2.age - p1.age }

    /**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = sortedBy { it.name }
    .sortedBy { it.surname }

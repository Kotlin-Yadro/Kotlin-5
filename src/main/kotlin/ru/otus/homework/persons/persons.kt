package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> = sortedByDescending { it.age }

/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = sortedWith(Comparator { p1, p2 ->
    val lastNameComparison = p1.surname.compareTo(p2.surname)
    if (lastNameComparison != 0) {
        lastNameComparison
    } else {
        p1.name.compareTo(p2.name)
    }
})

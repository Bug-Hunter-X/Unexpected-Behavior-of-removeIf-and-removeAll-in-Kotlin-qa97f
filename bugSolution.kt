fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }.toMutableList()
    println(newList) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val newList2 = list2.filterNot { it > 2 }.toMutableList()
    println(newList2) // Output: [1, 2]

    //For very large lists, consider using iterator for better performance
    val largeList = mutableListOf<Int>()
    for(i in 1..1000000) largeList.add(i)
    val filteredLargeList = largeList.iterator().asSequence().filter { it %2 == 0 }.toMutableList()
    println(filteredLargeList.size) // Output: 500000
}
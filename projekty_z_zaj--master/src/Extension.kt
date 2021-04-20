@file:Suppress("UNUSED_CHANGED_VALUE")

fun String.isSlash5(number: Int, word: String) {
    when {
        word.length % number == 0 -> println("${word} is / by ${number}")
        else -> println("${word} is not / by ${number}")
    }
}

fun String.numberOfChars(char: Char, word: String) {
    var count: Int = 0
    if (word.contains(char)) {
        count++
    }
}

fun Antnest.isAnyFreeAnts() = freeAnts >= 1
fun Antnest.isStorageIsntToFull() {
    val totalNumberOfItems: Int = wood + stone + food
    if (storage < totalNumberOfItems) {
        System.err.println("Storage is too full")
    }
}
fun Antnest.deleteOldestQueenAnt() {
    val index = listOfAnts
        .filter {
            it is QueenAnt
        }
        .map {
            it as QueenAnt
        }
        .withIndex()
        .maxBy {
            it.value.age
        }?.index

    index?.let { listOfAnts.removeAt(it) }
}

fun Main.showMainScreen(antnest: Antnest){
    println("Your resources:\n" +
            "food: ${antnest.food}, wood: ${antnest.wood}, stone: ${antnest.stone}.\n" +
            "Your ants: \n" +
            "Ants: ${antnest.freeAnts}, Workers: ${antnest.workersNumber}, Commanders: ${antnest.commandersNumber}, Queens: ${antnest.queensNumber}")
}

fun Antnest.numberOfCommanders() = listOfAnts
    .filter {
        it is CommanderAnt
    }
    .map {
        it as CommanderAnt
    }
    .count()

fun Antnest.NumberOfQueens() = listOfAnts
    .filter {
        it is QueenAnt
    }
    .map {
        it as QueenAnt
    }
    .filter {
        !it.ruleEnded == false
    }
    .count()

fun Antnest.numberOfWorkers() = listOfAnts
    .filter {
        it is WorkerAnt
    }
    .map {
        it as WorkerAnt
    }
    .count()
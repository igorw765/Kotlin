import java.util.*

class Antnest(
    var freeAnts : Int = 10,
    var food :  Int = 10,
    var wood :  Int = 5,
    var stone :  Int = 2,
    var storage :  Int = 100,
    var currentLevel : Int = 1,
    var commandersNumber: Int = 1,
    var queensNumber: Int = 0,
    var workersNumber: Int = 2,
    var listOfAnts: MutableList<Ant> = mutableListOf(WorkerAnt(), CommanderAnt(), WorkerAnt())


        ) {
        fun checkStorage() = food + wood + stone > storage


            fun levelUP() {
        var foodNeeded = currentLevel * 1
        var woodNeeded = currentLevel * 2
        var stoneNeeded = currentLevel * 1
        if (currentLevel > 5) {
            when {
                foodNeeded > food -> System.err.println("posiadasz za mało zmiennej food by wejść na wyższy poziom")
                woodNeeded > wood -> System.err.println("posiadasz za mało zmiennej wood by wejść na wyższy poziom")
                stoneNeeded > stone -> System.err.println("posiadasz za mało zmiennej stone by wejść na wyższy poziom")
                else -> {
                    currentLevel++
                    println("Zdobywasz poziom !!!")
                    println("aktualny poziom:  ${currentLevel}")
                }
            }

        } else {
            when {
                foodNeeded > food -> System.err.println("posiadasz za mało zmiennej food by wejść na wyższy poziom")
                woodNeeded > wood -> System.err.println("posiadasz za mało zmiennej wood by wejść na wyższy poziom")
                else -> {
                    currentLevel++
                    println("Zdobywasz poziom !!!")
                    println("aktualny poziom:  ${currentLevel}")
                }
            }

        }

    }

    fun buyWorker() {
        when {
            freeAnts < 1 -> System.err.println("Posiadasz za mało mrówek by kupić workera")
            food < 1 -> System.err.println("Posiadasz za mało zmiennej food by kupić workera")
            else -> {
                println("Zakupiono Worker")
                food--
                freeAnts--
//                val newWorker = WorkerAnt(age = 1, task = Tasks.NOTHING, earnings = 1000)
                workersNumber++
                println("Aktualna liczba Queenów: ${workersNumber}")
            }
        }
    }

    fun buyCommander() {
        when {
            freeAnts < 2 -> System.err.println("Posiadasz za mało mrówek by kupić Commandera")
            food < 1 -> System.err.println("Posiadasz za mało zmiennej food by kupić Commandera")
            wood < 2 -> System.err.println("Posiadasz za mało zmiennej wood by kupić Commandera")
            else -> {
                println("Zakupiono Comander")
                food--
                freeAnts -= 2
                wood -= 2
                commandersNumber++
                println("Aktualna liczba Comanderów: ${commandersNumber}")
            }
        }
    }

    fun buyQueen() {
        when {
            freeAnts < 5 -> System.err.println("Posiadasz za mało mrówek by kupić QueenAnt")
            food < 5 -> System.err.println("Posiadasz za mało zmiennej food by kupić QueenAnt")
            wood < 10 -> System.err.println("Posiadasz za mało zmiennej wood by kupić QueenAnt")
            stone < 2 -> System.err.println("Posiadasz za mało zmiennej stone by kupić QueenAnt")
            else -> {
                println("Zakupiono Queen")
                freeAnts -= 5
                food -= 5
                wood -= 10
                stone -= 2
                queensNumber++
                println("Aktualna liczba Queenów: ${queensNumber}")
            }

        }
    }

    fun createAnt(antType: Any) = when(antType){
        is WorkerAnt -> WorkerAnt()
        is CommanderAnt -> CommanderAnt()
        is QueenAnt -> QueenAnt()
        else -> null
    }

    fun showNumberOfWorkersAndCommandersWithOptions(){
        var x = numberOfWorkers()
        var y = numberOfCommanders()
        var i = 0
        if (x > 0 && y > 0){
            println("Number of Workers is equals to: ${x} \n" +
                    "Number of Commanders is equal to: ${y} \n" +
                    "Choose one of this: ")
            for (i in 0 until x){
                println("${i} Worker")
            }
            for (i in 0 until y){
                println("${i} Commander")
            }
        }else{
            System.err.println("You have not got any commander or worker")
            print("x: ${x}, y: ${y}")
        }

    }




}



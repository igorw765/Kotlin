class WorkerAnt(
    capacity: Int = 20,
    speed: Int = 3,
    age: Int = 1,
    earnings: Int = 0,
    var workHours: Int = 10,
    var task: Tasks = Tasks.NOTHING



):Ant(20, 3, 1, 50, 15) {
    //seter jest do zmiennej nad nim
    var earnings = earnings
        set(value) {
            if (value > 10000) {
                println("Za dużo zarabiasz")
                return
            }
            field = value
        }
    var food: Int = 0
    var wood : Int = 0
    var stone : Int = 0

    fun collect(resourcesType: Materials, antnest: Antnest ){
        if(checkResources() >=capacity){
            System.err.println()
            return
        }

        val boost = antnest.NumberOfQueens() * 2
        when(resourcesType){
            Materials.FOOD ->food += 1 + boost
            Materials.STONE -> stone += 1 + boost
            Materials.WOOD -> wood += 1 + boost
        }
    }

//    fun collect(what: Materials) {
//    if (checkResources() >= capacity) {
//        System.err.println("You have not got enought capacity to collect more materials")
//
//    }else{
//        if (what.equals("wood")) {
//            wood++
//        } else if (what.equals("food")) {
//            food++
//        } else if (what.equals("stone")) {
//            stone++
//        }else {
//            System.err.println("ERROR: ${what} is not alloved operation")
//            System.err.println("Posible solutions: ")
//            System.err.println("1. Mistake in the name of material (alloved : food, wood, stone).")
//            System.err.println("2. Code problem.")
//        }
//    }
//        }

    fun WorkerAnt.checkResources()= food+wood+stone


    fun addResourcesToAntnest(antnest: Antnest){

        for (foodCounter in 1 until food) {
            if(antnest.checkStorage()){
                System.err.println("You reach resources limit in Antnest")
                return
            }
            antnest.food ++

        }
        for (stoneCounter in 1 until stone) {
            if(antnest.checkStorage()){
                System.err.println("You reach resources limit in Antnest")
                return
            }
            antnest.stone ++

        }
        for (woodCounter in 1 until wood) {
            if(antnest.checkStorage()){
                System.err.println("You reach resources limit in Antnest")
                return
            }
            antnest.wood ++

        }
        }


        fun showTask() = println("Doing ${task.name}")


}

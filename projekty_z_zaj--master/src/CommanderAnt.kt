class CommanderAnt(
    var orders: ArrayList<Orders> = arrayListOf(Orders.NOTHING),
    capacity: Int = 2,
    speed: Int = 15,
    age: Int = 6,
    var level: Int = 1


) :Ant(2, 15,  6, 200, 100){

    fun assignTask(workerAnt: WorkerAnt, orders: Orders){
        when {
            this.orders.contains(orders).not() -> return
            else -> {
                println("Wydałem rozkaz ${orders.name}")
                workerAnt.task = Tasks.getByOrder(orders.name) ?: Tasks.NOTHING
            }
        }
        }
    }
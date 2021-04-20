import java.util.*

object Main{
    @JvmStatic
    fun main(args: Array<String>){
      val antnest = Antnest()
        showMainScreen(antnest)
        println("1. Shop\n" +
                "2. Operatings of Commander Ants\n" +
                "3. Exit"
        )

    val start = System.`in`.read()

    when(start) {
        49 -> {
            println("1. Buy Worker\n" +
                    "2. Buy Commander\n" +
                    "3. Buy Queen\n" +
                    "4. Exit"
            )
            val whatToBuy = System.`in`.read()
            when(whatToBuy){
                49 -> antnest.buyWorker()
                50 -> antnest.buyCommander()
                51 -> antnest.buyQueen()
                52 -> ("not working yet" /*clear consol and go back*/)
            }
        }
        50 -> {
            antnest.showNumberOfWorkersAndCommandersWithOptions()
        }
        51 -> {
            System.exit(-1)
        }
        52 -> {

        }

    }


    }


}
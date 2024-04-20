import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    when (age){
        in(0..2) ->  return "Infancy"
        in(3..11) -> return "Childhood"
        in(12..17) -> return "Teenage"
        in(18..59) -> return "Adulthood"

        else -> {
            (age >=60)
               return "Old age"

        }
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}
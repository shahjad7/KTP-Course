import com.faangx.ktp.basics.GradeCalculatorMiniApp


fun gradeFor(m1: Int, m2: Int, m3: Int, m4: Int, m5: Int): String {
    val average = (m1+m2+m3+m4+m5)/50f

    return when {
      average in 9f..10f -> "A+"
      average  in 8f..9f ->  "A"
      average  in 7f..8f ->  "B"
      average  in 6f..7f ->  "C"
      average  in 5f..6f ->  "D"
      average  in 3f..5f -> "E"

        else -> "Fail"
    }

}

fun main() {
    GradeCalculatorMiniApp(::gradeFor)
}
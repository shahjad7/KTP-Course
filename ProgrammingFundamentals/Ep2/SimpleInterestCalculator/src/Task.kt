import com.faangx.ktp.basics.SimpleInterestCalculatorMiniAppV1

fun getInterest(p: Float, r: Float, t: Float): Float {
    return (p*r*t)/100f
}

fun main() {
    SimpleInterestCalculatorMiniAppV1(::getInterest)
}
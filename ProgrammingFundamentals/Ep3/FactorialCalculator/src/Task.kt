import androidx.compose.ui.window.WindowPosition.PlatformDefault.x
import com.faangx.ktp.basics.FactorialCalculatorMiniApp

fun factorialOf(x: Long): Long {
    var factorials = 1L
    for(i in 2..x){
        factorials *= i
    }
    return factorials
}

fun permutationsOf(n: Long, r: Long): Long {
    var permutationss = 1L
    for(i in (n-r+1.. n)){
        permutationss *= i
    }
    return permutationss
}

fun combinationsOf(n: Long, r: Long): Long {
     return permutationsOf(n,r)/factorialOf(r)
}

fun main() {
    FactorialCalculatorMiniApp(
        ::factorialOf,
        ::permutationsOf,
        ::combinationsOf
    )
}
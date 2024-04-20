import com.faangx.ktp.basics.LeapYearCheckerMiniApp

fun isLeapYear(year: Int): Boolean {
    if((year%4==0) and (year%100!=0) or (year%400 == 0))
        return true
    else
        return false
}

fun LeapYearCheckerDemo() {
    LeapYearCheckerMiniApp(::isLeapYear)
}
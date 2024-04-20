import com.faangx.ktp.basics.VoteAgeCheckerMiniApp

fun canVote(age: Int): Boolean {
    return if(age>=18) return true else false
}

fun main() {
    VoteAgeCheckerMiniApp(::canVote)
}
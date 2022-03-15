fun main() {
    printLikes(0)
    printLikes(1)
    printLikes(11)
    printLikes(21)
    printLikes(56)
    printLikes(31)
    printLikes(1111)
}

fun printLikes(likes: Int) {
    if (likes == 0) {
        println("Никому не понравилось ((")
    } else if (likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else if (likes == 1 || ((likes % 10) == 1)) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes  людям")
    }
}

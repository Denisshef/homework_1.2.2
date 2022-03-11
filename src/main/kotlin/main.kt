fun main() {
    val likes = 38

    if (likes == 1) {
        print("Понравилось $likes человеку")
    } else if ((likes % 2) > 0) {
        print("Понравилось $likes человекам")
    } else {
        print("Понравилось $likes людям")
    }
}
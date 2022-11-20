import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var a = reader.nextInt()
    var m = 0

    while (a > 0) {
        if (a%10 > m)
        m = a % 10
        a /= 10
    }
    print("Наибольшая цифра: $m")
}
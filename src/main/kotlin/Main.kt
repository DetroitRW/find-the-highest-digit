import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var a = reader.nextInt()
    var m = 0

    while (a > 0) {
        m = max(a % 10, m)
        a /= 10
    }
    
    print("Наибольшая цифра: $m")
}
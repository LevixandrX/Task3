fun main() {
    while (true) {
        println("Введите натуральное число для преобразования в двоичную систему:")

        val input = readlnOrNull()

        if (input.isNullOrBlank() || !input.all { it.isDigit() }) {
            println("Ошибка: Введите корректное натуральное число.")
            continue
        }

        val number = input.toInt()

        if (number <= 0) {
            println("Ошибка: Введите положительное натуральное число.")
            continue
        }

        val binary = Integer.toBinaryString(number)

        println("Двоичное представление числа $number: $binary")
        break
    }
}
fun main() {
    // Пример массива целых чисел
    val array = intArrayOf(5, -2, 7, -1, 3)

    // Увеличиваем отрицательные элементы на единицу
    val updatedArray = increaseNegativeElements(array)
    println("Обновленный массив: ${updatedArray.joinToString(", ")}")

    // Подсчет локальных минимумов
    val localMinimaCount = countLocalMinima(updatedArray)
    println("Количество локальных минимумов: $localMinimaCount")

    // Пример матрицы
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Номер строки, которую нужно вывести
    val k = 2 // Например, 2-я строка (индекс 1)
    val kRow = getRowFromMatrix(matrix, k)
    println("Элементы $k-й строки: ${kRow.joinToString(", ")}")
}

// Функция для увеличения отрицательных элементов на единицу
fun increaseNegativeElements(arr: IntArray): IntArray {
    for (i in arr.indices) {
        if (arr[i] < 0) {
            arr[i] += 1
        }
    }
    return arr
}

// Функция для подсчета локальных минимумов
fun countLocalMinima(arr: IntArray): Int {
    var count = 0
    for (i in 1 until arr.size - 1) {
        if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
            count++
        }
    }
    return count
}

// Функция для получения K-й строки матрицы
fun getRowFromMatrix(matrix: Array<IntArray>, k: Int): IntArray {
    return if (k in 1..matrix.size) {
        matrix[k - 1] // k-1, так как индексация начинается с 0
    } else {
        intArrayOf() // Возвращаем пустой массив, если k вне диапазона
    }
}
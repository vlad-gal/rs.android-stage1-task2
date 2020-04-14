package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var first = 0
        var second = 1

        while (first * second <= n) {
            if (first * second == n) {
                return intArrayOf(first, second, 1)
            }
            val temp = first
            first = second
            second += temp
        }
        return intArrayOf(first, second, 0)
    }
}

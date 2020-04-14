package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val arrayA = a.toUpperCase().toList()
        val arrayB = b.toList()
        val i = arrayA.intersect(arrayB).toList()
        if (i == arrayB){
            return "YES"
        } else{
            return "NO"
        }
    }
}


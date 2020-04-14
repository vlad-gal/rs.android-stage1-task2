package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        val isPangram = ('a'..'z').all { inputString.toLowerCase().contains(it) }
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        val consonants = ('a'..'z').filter { it !in vowels }
        val pairs = mutableListOf<Pair<Int, String>>()
        if (isPangram) {
            val words: List<String> = inputString.split("\\s+".toRegex()).filter { "" != it }
            for (word in words) {
                var w = ""
                var i = 0
                for (c in word) {
                    if (c.toLowerCase() in vowels) {
                        i += 1
                        w += c.toUpperCase()
                    } else {
                        w += c
                    }
                }
                pairs.add(pairs.filter { it.first <= i }.size, Pair(i, i.toString() + w))
            }
            val result = mutableListOf<String>()
            for (pair in pairs) {
                result.add(pair.second)
            }
            return result.joinToString(" ")
        } else {
            val s = inputString.replace("\n", " ").replace("\r", " ")
            val words: List<String> = s.split("\\s+".toRegex()).filterNot { "" == it }
            for (word in words) {
                var w = ""
                var i = 0
                for (c in word) {
                    if (c.toLowerCase() in consonants) {
                        i += 1
                        w += c.toUpperCase()
                    } else {
                        w += c
                    }
                }
                pairs.add(pairs.filter { it.first <= i }.size, Pair(i, i.toString() + w))
            }
            val result = mutableListOf<String>()
            pairs.forEach { pair -> result.add(pair.second) }
            return result.joinToString(" ")
        }
    }
}

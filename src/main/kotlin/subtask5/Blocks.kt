package subtask5

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var i = 0
                for (item in blockA) {
                    if (item is Int) {
                        i += item.toInt()
                    }
                }
                return i
            }
            String::class -> {
                val s = StringBuilder()
                for (item in blockA) {
                    if (item is String) {
                        s.append(item.toString())
                    }
                }
                return s.toString()
            }
            else -> {
                val temp = mutableListOf<LocalDate>()
                for (item in blockA) {
                    if (item is LocalDate) {
                        temp.add(item)
                    }
                }
                temp.sortWith(Comparator { t1, t2 -> t2.compareTo(t1) })
                return temp[0].format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}

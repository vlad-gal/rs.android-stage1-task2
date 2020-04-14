package subtask1

import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        try {
            val date = LocalDate.of(year.toInt(),month.toInt(),day.toInt())
            val parse = date.format(DateTimeFormatter.ofPattern("d MMMM, EEEE",Locale("RU")))
            return parse
        } catch (e: Exception){
            return "Такого дня не существует"
        }
    }
}

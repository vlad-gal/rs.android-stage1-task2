package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val digits = arrayOf("one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        if (hour.toInt() in 1..23 &&  minute.toInt() in 0..59){
            return when (minute.toInt()){
                0 -> "${digits[hour.toInt() - 1]} o' clock"
                1 -> "one minute past ${digits[hour.toInt() - 1]}"
                15 -> "quarter past ${digits[hour.toInt() - 1]}"
                in 2..29 -> "${digits[minute.toInt() - 1]} minutes past ${digits[hour.toInt() - 1]}"
                30 -> "half past ${digits[hour.toInt() - 1]}"
                31 -> "one minute to ${digits[hour.toInt() - 1]}"
                45 -> "quarter to ${digits[hour.toInt()]}"
                in 32..59 -> "${digits[59 - minute.toInt()]} minutes to ${digits[hour.toInt()]}"
                else -> ""
            }
        } else{
            return ""
        }
    }
}

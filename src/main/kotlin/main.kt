fun main() {
    val second = 172801-2;
    println(agoToText(second))

}

fun agoToText(second: Int): String {
    var text: String;
    var minutes: Int;
    var hours: Int;
    text = when {
        second < 60 -> "был(а) только что"
        second < 60 * 60 -> {
            minutes = second / 60
            "был(а) " + minutes + " " + minuteText(minutes) + " назад"
        }

        second < 60 * 60 * 24 -> {
            hours = second / 60 / 60
            "был(а) " + hours + " " + hoursText(hours) + " назад"
        }
        second < 60 * 60 * 24*2 -> {
            "был(а) вчера"
        }
        second < 60 * 60 * 24*3 -> {
             "был(а) позавчера"
        }
        else -> "был(а) давно"
    }
    return text
}

fun minuteText(minutes: Int) =
    when (minutes) {
        11, 12, 13, 14 -> "минут"
        else ->
            when (minutes % 10) {
                1 -> "минуту"
                2, 3, 4 -> "минуты"
                else -> "минут"
            }
    }


/*
fun minuteText(minutes:Int):String{
    return  when(minutes){
        11,12,13,14->"минут"
        else ->
        when (minutes%10){
            1-> "минут"
            2,3,4->"минуты"
            else->"минут"}}
    }
*/
fun hoursText(hours: Int) =
    when (hours) {
        1,21 -> "час"
        2,3,4,22,23,24 ->"часа"
        else ->"часов"
    }
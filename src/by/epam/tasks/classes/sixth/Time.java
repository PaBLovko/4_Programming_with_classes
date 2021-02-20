package by.epam.tasks.classes.sixth;

/*      Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
        недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
        заданное количество часов, минут и секунд.
 */

import java.util.Arrays;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 24 || hours < 0)
            hours = 0;
        this.hours = hours;
    }

    int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        this.minutes = minutes;
    }

    int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        this.seconds = seconds;
    }

    public void setTime(int hours, int minutes, int seconds){
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public static void main(String[] args) {
        Time time = new Time(10,20,30);
        String timeSet = "10:23:50";
        time.setTime(parseForHours(timeSet),parseForMinutes(timeSet), parseForSeconds(timeSet));
        showTime(time);
    }

    private static void showTime(Time time){
        System.out.println(time.toString());
    }

    private static int[] parseTime(String timeSet){
        return Arrays.stream(timeSet.split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int parseForHours(String timeSet) {
        return parseTime(timeSet)[0];
    }

    private static int parseForMinutes(String timeSet){
        return parseTime(timeSet)[1];
    }

    private static int parseForSeconds(String timeSet) {
        return parseTime(timeSet)[2];
    }
}

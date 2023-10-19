public class Time {
    public int hours;
    public int minutes;

    public Time addTime(Time other) {
        Time nowy = new Time();
        nowy.hours = (hours+ other.hours) %24;
        if(other.minutes + minutes > 59) {
            nowy.hours++;
        }
        nowy.minutes = (minutes + other.minutes) % 60;
        return nowy;
    }
}

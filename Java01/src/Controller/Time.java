public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    // Chuẩn hóa thời gian (vd: 70 giây => +1 phút 10 giây)
    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }

    public void addSeconds(int sec) {
        seconds += sec;
        normalizeTime();
    }

    public void addMinutes(int min) {
        minutes += min;
        normalizeTime();
    }

    public void addHours(int hr) {
        hours += hr;
        normalizeTime();
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

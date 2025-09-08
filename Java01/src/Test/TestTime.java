public class TestTime {
    public static void main(String[] args) {
        Time t = new Time(1, 59, 50);
        System.out.println("Ban đầu: " + t.getTime());

        t.addSeconds(15);
        System.out.println("Sau khi cộng giây: " + t.getTime());

        t.addMinutes(2);
        System.out.println("Sau khi cộng phút: " + t.getTime());

        t.addHours(1);
        System.out.println("Sau khi cộng giờ: " + t.getTime());
    }
}

package Enumeration;
public class TASK016 {
    enum color {red, green, blue, yellow};
    enum weekdays{sunday , monday, tuesday}

    public static void main(String[] args) {
        color c1 = color.yellow;
        weekdays w1 = weekdays.sunday;
        System.out.println(c1);
        System.out.println(w1);

    }
}


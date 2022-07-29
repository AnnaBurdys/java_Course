package by.kursy.annaburdys.javatasks.Classwork.Stage24.model;

public enum WeekDayEnum {
    MONDAY,
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 7;

    private final String name;
    private final int number;

    WeekDayEnum(String name, int number) {
        this.name = name;
        this.number = number;
    }

    WeekDayEnum() {
        name = "Monday";
        number = 1;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public int getNumber() {
        return number;
    }

    /*public void setNumber(int number) {
        if (MIN_NUMBER<= number && number <= MAX_NUMBER) {
            this.number = number;
        }
    }*/

    @Override
    public String toString() {
        return  name + " (" + number + ")";
    }
}
public class HW_001 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(0));

        System.out.println(isLeapYear(2020));

        printString("abcd", 5);
    }

    // Написать метод, принимающий на вход два целых числа и проверяющий, что их
    // сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
    // противном случае – false.
    static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20)
            return true;
        else
            return false;
    }

    // проверить, что х положительное
    private static boolean isPositive(int x) {
        if (x >= 0)
            return true;
        else
            return false;
    }

    // проверить, является ли год високосным. если да - return true

    private static boolean isLeapYear(int year) {
        if (!(year % 4 == 0))
            return false;
        else
            return true;
    }

    // напечатать строку source repeat раз

    private static void printString(String source, int repeat) {
        String s = ("abcd");
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
        }
    }

}

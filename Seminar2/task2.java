package Seminar2;

public class task2 {
    public static void main(String args[]) {
        String myString = "шалаш";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println("строка является палиндромом");
        } else {
            System.out.println("строка не является палиндромом");
        }
    }
}
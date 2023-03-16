package Seminar6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коты:");
        Cat[] x = {new Cat("Барсик", 7), new Cat("Мурзик", 5), new Cat("Снежок", 15)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("------------------------------------------");
        System.out.println("досыпать еды");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("------------------------------------------");
        System.out.println("Коты получают еду:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
package Lesson_7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список котов:");
        Cat[] x = {new Cat("Мурка", 3),
                   new Cat("Мурка_2", 10),
                   new Cat("Мурка_3", 2)};
        for (Cat c : x) {
            System.out.println(c);
        }

        Plate plate = new Plate(10);
        plate.addPlateCapacity(0);
        System.out.println("\n" + plate);
        System.out.println("\nКошки покушали из тарелок:");
        for (Cat c : x) {
            c.setEat(plate);
            System.out.println(c);
            System.out.println(plate);
        }

    }

}


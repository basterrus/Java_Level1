package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat("Мурка");
        Cat murka1 = new Cat("Мурка");
        murka.run(150);
        murka.run(250);
        murka.swim(100);
        murka.getCount();

        Dog sharik = new Dog("Шарик");
        Dog sharik1 = new Dog("Шарик");
        Dog sharik2 = new Dog("Шарик");
        sharik.run(300);
        sharik.run(550);
        sharik.swim(5);
        sharik.swim(15);
        sharik.getCount();
    }
}



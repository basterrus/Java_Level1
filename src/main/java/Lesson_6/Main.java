package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat("�����");
        Cat murka1 = new Cat("�����");
        murka.run(150);
        murka.run(250);
        murka.swim(100);
        murka.getCount();

        Dog sharik = new Dog("�����");
        Dog sharik1 = new Dog("�����");
        Dog sharik2 = new Dog("�����");
        sharik.run(300);
        sharik.run(550);
        sharik.swim(5);
        sharik.swim(15);
        sharik.getCount();
    }
}



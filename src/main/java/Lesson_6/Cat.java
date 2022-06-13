package Lesson_6;

public class Cat extends Animal{

    public static int count;

    public Cat(String name) {
        super(name);
        ++count;
    }

    int maxRunDistance = 200;

    @Override
    void run(int runningDistance) {
        if (runningDistance < maxRunDistance) {
            System.out.println(name + " пробежал(а) " + runningDistance + " м.");
        } else {
            System.out.println("Дистанция слишком большая! \n" + name +
                    " не сможет пробежать " + runningDistance + "\n" + "максимальное расстояние " + maxRunDistance);
        }
    }

    @Override
    void swim(int swimDistance) {
        System.out.println("Кошки не умеют плавать, не нужно мучить животное! ");
    }


    void getCount(){
        if (count == 1){
            System.out.println("Создан " + count + " кот\n");
        } else if (count >= 2 && count <= 4) {
            System.out.println("Создано " + count + " кота\n");
        }else {
            System.out.println("Создано " + count + " котов\n");
        }
    }
}


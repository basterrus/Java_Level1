package Lesson_6;

public class Dog extends Animal {

    public static int count;
    public Dog(String name) {
        super(name);
        ++count;
    }

    int maxRunDistance = 500;
    int maxSwimDistance = 10;

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
        if (swimDistance > 0 && swimDistance <= maxSwimDistance) {
            System.out.println(name + " проплыл(а) " + swimDistance + " м.");
        } else {
            System.out.println("Дистанция слишком большая! \n" + name +
                    " не сможет проплыть " + swimDistance + "\n" + "максимальное расстояние " + maxSwimDistance);
        }
    }


    void getCount(){
        if (count == 1){
            System.out.println("Создан " + count + " собака\n");
        } else if (count >= 2 && count <= 4) {
            System.out.println("Создано " + count + " собаки\n");
        }else {
            System.out.println("Создано " + count + " собак\n");
        }
    }


}


//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому
// методу передается длина препятствия. Результатом выполнения действия
// будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
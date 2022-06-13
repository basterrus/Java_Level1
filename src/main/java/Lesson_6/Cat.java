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
            System.out.println(name + " ��������(�) " + runningDistance + " �.");
        } else {
            System.out.println("��������� ������� �������! \n" + name +
                    " �� ������ ��������� " + runningDistance + "\n" + "������������ ���������� " + maxRunDistance);
        }
    }

    @Override
    void swim(int swimDistance) {
        System.out.println("����� �� ����� �������, �� ����� ������ ��������! ");
    }


    void getCount(){
        if (count == 1){
            System.out.println("������ " + count + " ���\n");
        } else if (count >= 2 && count <= 4) {
            System.out.println("������� " + count + " ����\n");
        }else {
            System.out.println("������� " + count + " �����\n");
        }
    }
}


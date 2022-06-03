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
            System.out.println(name + " ��������(�) " + runningDistance + " �.");
        } else {
            System.out.println("��������� ������� �������! \n" + name +
                    " �� ������ ��������� " + runningDistance + "\n" + "������������ ���������� " + maxRunDistance);
        }
    }


    @Override
    void swim(int swimDistance) {
        if (swimDistance > 0 && swimDistance <= maxSwimDistance) {
            System.out.println(name + " �������(�) " + swimDistance + " �.");
        } else {
            System.out.println("��������� ������� �������! \n" + name +
                    " �� ������ �������� " + swimDistance + "\n" + "������������ ���������� " + maxSwimDistance);
        }
    }


    void getCount(){
        if (count == 1){
            System.out.println("������ " + count + " ������\n");
        } else if (count >= 2 && count <= 4) {
            System.out.println("������� " + count + " ������\n");
        }else {
            System.out.println("������� " + count + " �����\n");
        }
    }


}


//1. ������� ������ ������ � ��� � ������������� �� ������ ��������.
//2. ��� �������� ����� ������ � �����. � �������� ��������� �������
// ������ ���������� ����� �����������. ����������� ���������� ��������
// ����� ������ � �������. (��������, dogBobik.run(150); -> '����� �������� 150 �.');
//3. � ������� ��������� ���� ����������� �� �������� (���: ��� 200 �., ������ 500 �.;
// ��������: ��� �� ����� �������, ������ 10 �.).
//4. * �������� ������� ��������� �����, ����� � ��������.
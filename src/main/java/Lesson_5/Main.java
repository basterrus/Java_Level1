package Lesson_5;


public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("���� ������", "�������� �������� 1", "yuri@petrov.com", "88005553501", 35000, 40);
        employees[1] = new Employee("���� ������", "�������� �������� 2", "ivan@petrov.com", "88005553502", 45000, 42);
        employees[2] = new Employee("������� ������", "�������� �������� 3", "evgeny@ivanov.com", "88005553503", 55000, 32);
        employees[3] = new Employee("�������� ��������", "�������� �������� 4", "viacheslaav@petrosian.com", "88005553504", 65000, 62);
        employees[4] = new Employee("���� ��������", "�������� �������� 5", "ashot@jganesian.com", "88005553505", 25000, 22);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.getEmployeeInfo();
            }
        }
    }
}

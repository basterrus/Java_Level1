package Lesson_5;

public class Employee {
    private String name;
    private String vacancyName;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String name, String vacancyName, String email, String phone, float salary, int age) {
        this.name = name;
        this.vacancyName = vacancyName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "ФИО: " + name + ", Должность: " + vacancyName + ", email: " + email + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age;
    }

    public void getEmployeeInfo() {
        System.out.println(toString());
    }

    public int getAge() {
        return age;
    }
}




package Lesson_6;

public abstract class Animal {
    protected String name;

    abstract void run(int runningDistance);
    abstract void swim(int swimDistance);

    public Animal(String name){
        this.name = name;
    }

}




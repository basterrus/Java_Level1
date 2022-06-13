package Lesson_7;

public class Cat  {
    private String name;
    private int appetite;
    private boolean wellFed;

    @Override
    public String toString() {
        return  "Кошка " + name  + " аппетит " + appetite + " кошка сыта: " + wellFed;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    void setEat(Plate plate) {
        if (plate.getCapacityPlate() > appetite) {
            plate.decreaseFood(appetite);
            wellFed = true;
        }
    }
}
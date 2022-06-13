package Lesson_7;

public class Plate {
    private int plateCapacity;

    public Plate(int plateCapacity) {
        this.plateCapacity = plateCapacity;
    }

    void decreaseFood(int appetite) {
        if (isPlateEmpty())
            return;
        if (appetite > plateCapacity) {
            plateCapacity = 0;
        } else
            this.plateCapacity -= appetite;
    }

    boolean isPlateEmpty() {
        return plateCapacity == 0;
    }


    public void addPlateCapacity(int capacity) {
        plateCapacity += capacity;
    }

    int getCapacityPlate() {
        return plateCapacity;
    }


    @Override
    public String toString() {
        return "Вместимость тарелки: " + plateCapacity;
    }
}

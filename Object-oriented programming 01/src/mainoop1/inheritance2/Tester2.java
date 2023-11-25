package mainoop1.inheritance2;

class Vechical {
    private String vecId;
    private String vecCompName;

    public Vechical() {

    }

    public Vechical(String vecId, String vecCompName) {
        this.vecId = vecId;
        this.vecCompName = vecCompName;
    }

    public String getVecId() {
        return vecId;
    }

    public void setVecId(String vecId) {
        this.vecId = vecId;
    }

    public String getVecCompName() {
        return vecCompName;
    }

    public void setVecCompName(String vecCompName) {
        this.vecCompName = vecCompName;
    }

}

class Car extends Vechical {
    private String color;
    private double price;

    public Car() {
        super();
    }

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public Car(String vecId, String vecCompName, String color, double price) {
        super(vecId, vecCompName);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class Truck extends Car {
    private int capacity;

    public Truck(int capacity) {
        super();
        this.capacity = capacity;
    }

    public Truck(String color, double price, int capacity) {
        super(color, price);
        this.capacity = capacity;
    }

    public Truck(String vecId, String vecCompName, String color, double price, int capacity) {
        super(vecId, vecCompName, color, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

public class Tester2 {
    public static void main(String[] args) {

        Truck t1 = new Truck("T101", "Mahindra", "Black", 34.7, 4);

        String vecId = t1.getVecId();
        String vechCompneyName = t1.getVecCompName();
        String color = t1.getColor();
        double price = t1.getPrice();
        int capacity = t1.getCapacity();

        System.out.println("Track info: ");
        System.out.print(vecId + " , " + vechCompneyName + " , " + color + " , " + price + " , " + capacity);
    }
}

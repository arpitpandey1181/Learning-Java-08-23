package mainoop1.inheritance1;

class Laptop {
    private String compneyName = "Dell";

    public Laptop() {
    }

    public Laptop(String compneyName) {
        this.compneyName = compneyName;
    }

    public String getCompneyName() {
        return compneyName;
    }

    public void setCompneyName(String compneyName) {
        this.compneyName = compneyName;
    }

}

class DellVista extends Laptop {
    private String modelNumber;
    private String build;
    private int price;

    public DellVista(String modelNumber, String build, int price) {
        super();
        this.modelNumber = modelNumber;
        this.build = build;
        this.price = price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class SingleIn01 {
    public static void main(String[] args) {

        DellVista mylap1 = new DellVista("DELL010ES", "Solid", 98000);
    }
}

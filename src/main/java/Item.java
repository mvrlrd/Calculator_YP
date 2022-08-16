public class Item {
    private double price;
    private String name;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Item(){
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}

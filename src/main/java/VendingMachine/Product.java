package VendingMachine;


public enum Product {
    Coke("Coke", 10), Pepsi("Pepsi", 10), Fanta("Fanta", 10),
    OLW("OLW Chips", 25), Estrella("Estrella Chips", 20), Cheap("Cheapy Chips", 15);


    private String name;
    private int price;

    private Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}

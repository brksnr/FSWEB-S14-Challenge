package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public DeluxeBurger() {
        super("Deluxe", "Beef", 19.10, "White");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }


    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("/nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("/nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("/nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("/nDeluxe Burger için yeni malzeme eklenemez.");
    }
}

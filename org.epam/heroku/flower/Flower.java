package flower;

public enum Flower {
    Tulip(2.0), Rose(3.0), Narcisse(1.5), Sunflower(5), Gerbera(2), Chrysanthemum(0.9), Daisy(1.3), Poppy(2);
    private double count;
    private int quantity;

    Flower(double v) {
        this.count = v;
    }

    public double getCount() {
        return count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

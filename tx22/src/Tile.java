public class Tile extends Product {
    private double width;
    private double length;

    public Tile() {
    }

    public Tile(String product_id, String product_name, double product_price, int product_total, double width, double length) {
        super(product_id, product_name, product_price, product_total);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getTotalPrice() {
        return getProduct_price() * getProduct_total();
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nLength: " + length;
    }

    public void xuat() {
        System.out.println(toString());
    }
}

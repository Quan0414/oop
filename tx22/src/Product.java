public abstract class Product {
    private String product_id;
    private String product_name;
    private double product_price;
    private int product_total;

    public Product() {
    }

    public Product(String product_id, String product_name, double product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        try {
            if (product_id == null || product_id.trim().isEmpty()) {
                throw new IllegalArgumentException("Mã sản phẩm không được để trống.");
            }
            this.product_id = product_id;
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }


    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public abstract double getTotalPrice();

    public String toString() {
        return "Product ID: " + product_id + "\nProduct Name: " + product_name + "\nProduct Price: " + product_price + "\nProduct Total: " + product_total;
    }

    public void xuat() {
        System.out.println(toString());
    }

}

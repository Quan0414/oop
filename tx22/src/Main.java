import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tile> listTile = new ArrayList<>();
        TileManagerImpl tileManagerImpl = new TileManagerImpl();
        int choose;
        do {
            System.out.println("1. Add Tile");
            System.out.println("2. Edit Tile");
            System.out.println("3. Delete Tile");
            System.out.println("4. Search Tile");
            System.out.println("5. Sort Tile");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Enter product id: ");
                    String product_id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    String product_name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double product_price = sc.nextDouble();
                    System.out.print("Enter product total: ");
                    int product_total = sc.nextInt();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    Tile t = new Tile(product_id, product_name, product_price, product_total, width, length);
                    tileManagerImpl.addTile(t);
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    product_id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    product_name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    product_price = sc.nextDouble();
                    System.out.print("Enter product total: ");
                    product_total = sc.nextInt();
                    System.out.print("Enter width: ");
                    width = sc.nextDouble();
                    System.out.print("Enter length: ");
                    length = sc.nextDouble();
                    t = new Tile(product_id, product_name, product_price, product_total, width, length);
                    tileManagerImpl.editTile(t);
                    break;
                case 3:
                    System.out.print("Enter product id: ");
                    product_id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    product_name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    product_price = sc.nextDouble();
                    System.out.print("Enter product total: ");
                    product_total = sc.nextInt();
                    System.out.print("Enter width: ");
                    width = sc.nextDouble();
                    System.out.print("Enter length: ");
                    length = sc.nextDouble();
                    t = new Tile(product_id, product_name, product_price, product_total, width, length);
                    tileManagerImpl.delTile(t);
                    break;
                case 4:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    List<Tile> result = tileManagerImpl.searchTile(name);
                    for (Tile tile : result) {
                        tile.xuat();
                    }
                    break;
                case 5:
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    result = tileManagerImpl.sortedTile(price);
                    for (Tile tile : result) {
                        tile.xuat();
                    }
                    break;
            }
        } while (choose != 6);
    }
}
import java.util.List;

public interface ITileManager {
    public boolean addTile(Tile t);
    public boolean editTile(Tile t);
    public boolean delTile(Tile t);
    public List<Tile> searchTile(String name);
    public List<Tile> sortedTile(double price);
}

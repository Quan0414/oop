import java.util.ArrayList;
import java.util.List;

public class TileManagerImpl implements ITileManager {
    private List<Tile> listTile;

    public TileManagerImpl() {
        listTile = new ArrayList<>();
    }

    @Override
    public boolean addTile(Tile t) {
        return listTile.add(t);
    }

    @Override
    public boolean editTile(Tile t) {
        for (Tile tile : listTile) {
            if (tile.getProduct_id().equals(t.getProduct_id())) {
                tile.setProduct_name(t.getProduct_name());
                tile.setProduct_price(t.getProduct_price());
                tile.setProduct_total(t.getProduct_total());
                tile.setWidth(t.getWidth());
                tile.setLength(t.getLength());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delTile(Tile t) {
        return listTile.remove(t);
    }

    @Override
    public List<Tile> searchTile(String name) {
        List<Tile> result = new ArrayList<>();
        for (Tile tile : listTile) {
            if (tile.getProduct_name().contains(name)) {
                result.add(tile);
            }
        }
        return result;
    }

    @Override
    public List<Tile> sortedTile(double price) {
        List<Tile> result = new ArrayList<>();
        for (Tile tile : listTile) {
            if (tile.getProduct_price() >= price) {
                result.add(tile);
            }
        }
        return result;
    }
}

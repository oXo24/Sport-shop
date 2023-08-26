import Interface.Item;
import Interface.Manufacturer;

public abstract class Shirt implements Item {

    @Override
    public Manufacturer manufacturer() {
        return new ActiveSports();
    }

    @Override
    public abstract float price();
}

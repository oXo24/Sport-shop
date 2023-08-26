public abstract class Cap implements Item {

    @Override
    public Manufacturer manufacturer() {
        return new SmartCaps();
    }

    @Override
    public abstract float price();
}

package Integration;

public class RegistryCreator {

    private ItemRegistry itemRegistry;

    private ExternalSystems externalSystems;

    private DiscountRegistry discountRegistry;

    public RegistryCreator() {
        itemRegistry = new ItemRegistry();
        externalSystems = new ExternalSystems();
        discountRegistry = new DiscountRegistry();
    }

    public DiscountRegistry getDiscountRegistry() {
        return discountRegistry;
    }

    public ItemRegistry getItemRegistry() {
        return itemRegistry;
    }

    public ExternalSystems getExternalSystems() {
        return externalSystems;
    }

}

package Integration;

/**
 *
 * @author Rikard
 */
public class RegistryCreator {

    private ItemRegistry itemRegistry;

    private ExternalSystems externalSystems;

    private DiscountRegistry discountRegistry;

    /**
     *
     */
    public RegistryCreator() {
        itemRegistry = new ItemRegistry();
        externalSystems = new ExternalSystems();
        discountRegistry = new DiscountRegistry();
    }

    /**
     *
     * @return
     */
    public DiscountRegistry getDiscountRegistry() {
        return discountRegistry;
    }

    /**
     *
     * @return
     */
    public ItemRegistry getItemRegistry() {
        return itemRegistry;
    }

    /**
     *
     * @return
     */
    public ExternalSystems getExternalSystems() {
        return externalSystems;
    }

}

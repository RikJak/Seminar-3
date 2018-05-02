package Integration;

public class RegistryCreator {

	private ItemRegistry itemRegistry;

	private ExternalSystems externalSystems;

	public RegistryCreator RegistryCreator() {
            itemRegistry = new ItemRegistry();
            externalSystems = new ExternalSystems();
		return this;
	}

	public ItemRegistry getItemRegistry() {
		return itemRegistry;
	}

	public ExternalSystems getExternalSystems() {
		return externalSystems;
	}

}

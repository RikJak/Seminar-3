package Integration;

public class RegistryCreator {

	private ItemRegistry itemRegistry;

	private ExternalSystems externalSystems;

	public RegistryCreator() {
            itemRegistry = new ItemRegistry();
            externalSystems = new ExternalSystems();
	}

	public ItemRegistry getItemRegistry() {
		return itemRegistry;
	}

	public ExternalSystems getExternalSystems() {
		return externalSystems;
	}

}

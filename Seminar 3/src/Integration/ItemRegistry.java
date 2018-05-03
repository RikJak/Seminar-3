package Integration;

import java.util.*;

public class ItemRegistry {

	private HashMap<ItemIdentifier,Item> itemRegistry;

	public Item getItem(int itemID) {
		return itemRegistry.get(new ItemIdentifier(itemID));
                
	}

	public ItemRegistry(){
		
            itemRegistry = new HashMap<>(10);
                Item car = new Item(111,new ItemDescription("This is a car"),new AmountOfMoney(10000),"Vehicle");

            itemRegistry.put(car.getItemID(), car);
            
            Item truck = new Item(112, new ItemDescription("This is a truck"), new AmountOfMoney(20000), "Vehicle");

            itemRegistry.put(truck.getItemID(), truck);
            Item bus = new Item(113, new ItemDescription("This is a bus"), new AmountOfMoney(30000), "Vehicle");

            itemRegistry.put(bus.getItemID(), bus);
            
            Item apple = new Item(200, new ItemDescription("This is an apple"), new AmountOfMoney(10.50), "Food");

            itemRegistry.put(apple.getItemID(), apple);
            
            Item banana = new Item(201, new ItemDescription("This is a banana"), new AmountOfMoney(14.99), "Food");

            itemRegistry.put(banana.getItemID(), banana);
            
            Item baseball = new Item(300, new ItemDescription("This is a baseball"), new AmountOfMoney(10), "Miscellaneous");

            itemRegistry.put(baseball.getItemID(), baseball);

                
                        }
                
	}


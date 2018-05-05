package Integration;

import Utilities.SaleDTO;
import Model.Reciept;

/**
 *This class represents external systems, ie. the accounting system and the inventory system.
 * @author Rikard
 */
public class ExternalSystems {

    /**
     * Does nothing as we are not to interact with an actual system.
     * @param saleInformation final sale information used to update the system.
     */
    public void updateInventorySystem(SaleDTO saleInformation) {

	}

    /**
     * Does nothing as we are not to interact with an actual system.
     * @param saleInformation final sale information used to update the system.
     */
    public void updateAccountingSystem(SaleDTO saleInformation) {

	}

    /**
     * Initializes the external systems.
     */
    public ExternalSystems(){
        
	}


}

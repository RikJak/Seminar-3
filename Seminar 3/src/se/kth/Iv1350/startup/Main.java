package se.kth.iv1350.startup;
import se.kth.iv1350.view.View;
import se.kth.iv1350.integration.Printer;
import se.kth.iv1350.integration.RegistryCreator;
import se.kth.iv1350.controller.Controller;

/**
 *
 * @author Rikard
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
  
        RegistryCreator registries = new RegistryCreator();
        
        Printer printer = new Printer();
        
        Controller contr = new Controller(registries,printer);

        View view = new View(contr);
        
        view.sampleExcecution();
        
     
        
    }
}

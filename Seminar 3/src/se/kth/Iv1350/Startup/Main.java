package se.kth.iv1350.Startup;
import se.kth.iv1350.View.View;
import se.kth.iv1350.Integration.Printer;
import se.kth.iv1350.Integration.RegistryCreator;
import se.kth.iv1350.Controller.Controller;

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

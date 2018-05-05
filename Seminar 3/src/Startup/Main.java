package Startup;
import Controller.*;
import Integration.*;
import View.*;

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

package Startup;
import Controller.*;
import Integration.*;
import View.*;


public class Main {
    public static void main(String[] args) {
  
        RegistryCreator registries = new RegistryCreator();

        
        Controller contr = new Controller(registries);

        View view = new View(contr);
        
        view.sampleExcecution();
        
     
        
    }
}

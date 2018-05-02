package Startup;
import Controller.*;
import Integration.*;
import View.*;


public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        RegistryCreator registries = new RegistryCreator();
        Controller contr = new Controller(registries);
        
        View view = new View(contr);
        
        contr.scanItem(1, 111);
        
    }
}

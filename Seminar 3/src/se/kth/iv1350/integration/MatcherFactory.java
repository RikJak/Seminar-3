
package se.kth.iv1350.integration;

import se.kth.iv1350.utilities.ItemDescriptionMatcher;
import se.kth.iv1350.utilities.ItemIDMatcher;

/**
 * This a factory that creates instances of implementations of the ItemMatcher interface.
 * It is a singleton because there should only exist one in the program.
 * @author Rikard
 */
public class MatcherFactory {
    private static final MatcherFactory MATCHER_FACTORY = new MatcherFactory();
    private String defaultMatch;
    private final String DESCRIPTION = "Description";
    private final String ID = "ID";
    
    private MatcherFactory(){
        defaultMatch = ID;
    }

    /**
     * Returns a new instance of the ItemMatcher set for the factory.
     * If it doesn't match any of the presets it'll return an instance of an ID matcher.
     * @return The ItemMatcher implementation specified.
     */
    public ItemMatcher getMatcher(){
        switch(defaultMatch){
                case(ID):
                    return new ItemIDMatcher();
                case(DESCRIPTION):
                    return new ItemDescriptionMatcher();
                default:
                    return new ItemIDMatcher();
        }
    }
    
    /**
     * Changes which implementation the factory shall use.
     * @param newDefault the new default matcher.
     */
    public void setDefaultItemMatcher(ItemMatcher newDefault){
        if(newDefault instanceof ItemIDMatcher){
            defaultMatch = ID;
        }else if(newDefault instanceof ItemDescriptionMatcher){
            defaultMatch = DESCRIPTION;
        }
    }
    
    /**
     * Returns an instance of the MatcherFactory
     * @return the matcher factory.
     */
    public static MatcherFactory getInstanceOf(){
        return MATCHER_FACTORY;
    }
}

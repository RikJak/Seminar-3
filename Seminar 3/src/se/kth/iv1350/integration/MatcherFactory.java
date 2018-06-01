
package se.kth.iv1350.integration;

import se.kth.iv1350.utilities.ItemIDMatcher;

/**
 * This a factory that creates instances of implementations of the ItemMatcher interface.
 * It is a singleton because there should only exist one in the program.
 * @author Rikard
 */
public class MatcherFactory {
    private static final MatcherFactory MATCHER_FACTORY = new MatcherFactory();
    private ItemMatcher defaultMatcher;
    
    private MatcherFactory(){
        defaultMatcher = new ItemIDMatcher();
    }

    /**
     * Returns the default ItemMatcher specified at startup
     * @return The default ItemMatcher implementation.
     */
    public ItemMatcher getDefaultMatcher(){
        return defaultMatcher;
    }
    
    /**
     * Changes which implementation the factory shall use.
     * @param newDefault the new default matcher.
     */
    public void setDefaultItemMatcher(ItemMatcher newDefault){
        defaultMatcher = newDefault;
    }
    
    /**
     * Returns an instance of the MatcherFactory
     * @return the matcher factory.
     */
    public static MatcherFactory getInstanceOf(){
        return MATCHER_FACTORY;
    }
}

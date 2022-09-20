
package com.mycompany.singletone;
/**
 *
 * @author noorahmad
 */
public final class singletone{
 
    private static Singletone instance;
    public String value;

    private Singletone(String value){
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singletone getInstance(String value) {
        if (instance == null) {
            instance = new Singletone(value);
        }
        return instance;
    }
}
    


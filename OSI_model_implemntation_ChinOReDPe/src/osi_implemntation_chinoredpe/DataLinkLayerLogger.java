
package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 * 
 */
public class DataLinkLayerLogger extends AbstractLogger {

   public DataLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("DataLinke::Logger: " + message);
   }
}

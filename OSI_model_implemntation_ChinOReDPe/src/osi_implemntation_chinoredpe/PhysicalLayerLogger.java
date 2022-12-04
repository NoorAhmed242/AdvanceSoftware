
package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 */
public class PhysicalLayerLogger extends AbstractLogger {

   public PhysicalLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Physical Console::Logger: " + message);
   }
}
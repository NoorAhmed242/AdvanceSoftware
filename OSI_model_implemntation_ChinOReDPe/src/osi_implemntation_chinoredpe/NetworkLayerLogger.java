
package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 */
public class NetworkLayerLogger extends AbstractLogger {

   public NetworkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Network Layer Console::Logger: " + message);
   }
}


package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 */
public class SessionLinkLayerLogger extends AbstractLogger {

   public SessionLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Sesseon Layer::Logger: " + message);
   }
}


package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 */
public class TransportLinkLayerLogger extends AbstractLogger {

   public TransportLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Transport::Logger: " + message);
   }
}

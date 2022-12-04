
package osi_implemntation_chinoredpe;

/**
 *
 * @author Noor Ahmad
 */
public class PresentationLinkLayerLogger extends AbstractLogger {

   public PresentationLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Presentation Layer::Logger: " + message);
   }
}

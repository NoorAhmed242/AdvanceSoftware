
package osi_implemntation_chinoredpe;

/**

 * @author Noor Ahmad
 */
public class ApplicationLinkLayerLogger extends AbstractLogger {

   public ApplicationLinkLayerLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Application Layer::Logger: " + message);
   }
}

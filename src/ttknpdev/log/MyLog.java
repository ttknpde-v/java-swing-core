
package ttknpdev.log;
import org.apache.log4j.Logger;
import ttknpdev.exercise2.ConvertCelsius;
import ttknpdev.understandui.FirstSwing;
import ttknpdev.understandui.SecondSwing;
import ttknpdev.understandui.SixthSwing;


public interface MyLog {
    Logger convertCelSius = Logger.getLogger(ConvertCelsius.class); 
    Logger log = Logger.getLogger(SixthSwing.class);
}

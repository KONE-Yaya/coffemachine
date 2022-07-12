import java.util.logging.Logger;

public class DrinkMaker {

    private static Logger LOGGER  = Logger.getLogger(DrinkMaker.class.getName());

    public static void makeCommand(String c){
        LOGGER.info("Making command: "+ c);
        //command stuff
    }
}

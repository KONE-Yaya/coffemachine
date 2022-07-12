import java.text.DecimalFormat;
import java.util.logging.Logger;

public class DrinkMaker {

    private static Logger LOGGER  = Logger.getLogger(DrinkMaker.class.getName());

    public static void makeCommand(String c, Float money){

        LOGGER.info("Drink has received a command: "+ c);

        String [] commandParts = c.split(":");

        for(Drinks t : Drinks.values()){
            if( commandParts[0].equals(t.getCode())) {
                if(money >= t.getPrice()){
                    LOGGER.info("Making command: "+ c);
                    //command stuff
                    System.out.println("Your: " + t.getLabel() + " has been successfully made !");
                }else{
                    LOGGER.info("Money not enough !");

                    DecimalFormat df = new DecimalFormat("0.00");
                    String remainingMoney =  df.format(t.getPrice() - money);
                    System.out.println("Could not make your " + t.getLabel() + " , missing "+ remainingMoney + "€");
                }
                break;
            }
        }

    }
}

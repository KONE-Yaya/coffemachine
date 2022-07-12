import java.util.logging.Logger;

public class DrinkMaker {

    private static Logger LOGGER  = Logger.getLogger(DrinkMaker.class.getName());

    public static void makeCommand(String c, Float money){

        LOGGER.info("Drink has received a command: "+ c);

        for(Drinks t : Drinks.values()){
            if( c.charAt(0)==t.getCode().charAt(0)) {
                if(money >= t.getPrice()){
                    LOGGER.info("Making command: "+ c);
                    //command stuff
                    System.out.println("Your: " + t.getLabel() + " has been successfully made !");
                }else{
                    LOGGER.info("Money not enough !");
                    Float remainingMoney = t.getPrice() - money;
                    System.out.println("Could not make your " + t.getLabel() + " , missing "+ remainingMoney + "€");
                }
                break;
            }
        }

    }
}

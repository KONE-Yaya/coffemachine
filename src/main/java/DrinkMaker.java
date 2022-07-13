import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.logging.Logger;

public class DrinkMaker {

    private static Logger LOGGER  = Logger.getLogger(DrinkMaker.class.getName());

    private Float earn;
    private HashMap<String,Integer> drinksCount;

    DrinkMaker(){
        this.earn = 0F;
        this.drinksCount = new HashMap<>();

        for(Drinks t : Drinks.values()){
            drinksCount.put(t.getLabel(),0);
        }
    }

    public void makeCommand(String c, Float money){

        LOGGER.info("Drink has received a command: "+ c);

        String [] commandParts = c.split(":");

        for(Drinks t : Drinks.values()){
            if( commandParts[0].equals(t.getCode())) {
                if(money >= t.getPrice()){
                    LOGGER.info("Making command: "+ c);
                    //command stuff
                    System.out.println("Your: " + t.getLabel() + " has been successfully made !");

                    this.earn += t.getPrice();
                    int count = this.drinksCount.get(t.getLabel());
                    this.drinksCount.put(t.getLabel(),count+1);

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

    public void report(){
        LOGGER.info("Making report...");

        for (String label : this.drinksCount.keySet()) {
            System.out.println(label + " : " + this.drinksCount.get(label));
        }
        System.out.println("Total earnings: " + this.earn + "€");
    }

    public Float getEarn() {
        return earn;
    }

    public void setEarn(Float earn) {
        this.earn = earn;
    }

    public HashMap<String, Integer> getDrinksCount() {
        return drinksCount;
    }

    public void setDrinksCount(HashMap<String, Integer> drinksCount) {
        this.drinksCount = drinksCount;
    }

}

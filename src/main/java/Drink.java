import java.util.logging.Logger;

public class Drink implements  IDrink{

    final Logger LOG = Logger.getLogger(Drink.class.getName());

    enum Drinks {

        Tea("Tea", "T"),
        Coffee("Coffee", "C"),
        Chocolate("Chocolate", "H");

        private final String label;
        private final String code;

        private Drinks(String label, String code) {
            this.label = label;
            this.code = code;
        }
        public String getLabel() {
            return label;
        }

        public String getCode() {
            return code;
        }
    }

    private String type;
    private int sugar;

    @Override
    public String getCommand(){
        StringBuilder builder = new StringBuilder();
        builder.append(type).append(":");
        if(sugar > 0)
            builder.append(sugar).append(":").append("0");
        else
            builder.append(":");

        return builder.toString();
    }

    Drink(String type, int sugar){
        this.type = type;
        this.sugar = sugar > 2 ? 2 : sugar;
    }

    Drink(String type){
        this(type, 0);
    }

    public static IDrink parse(String drink){

        String [] parts = drink.split(",");

        String type = "";
        for(Drinks t : Drinks.values()){
            if(t.getLabel().equals(parts[0])) {
                type = t.getCode();
                break;
            }
        }
        int sugar = Integer.valueOf(parts[1]);
        if(sugar > 0) return new Drink(type, sugar);
        return new Drink(type);
    }

}

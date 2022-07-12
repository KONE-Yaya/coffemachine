public class Main {

    public static void main(String[] args) {
        String command = "Chocolate,2";
        IDrink drink = Drink.parse(command);
        DrinkMaker.makeCommand(drink.getCommand(), 0.2F);
    }
}

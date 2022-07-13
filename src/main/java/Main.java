public class Main {

    public static void main(String[] args) {

        String command1 = "Orange,2";
        IDrink drink1 = Drink.parse(command1);
        String command2 = "Chocolate,0";
        IDrink drink2 = Drink.parse(command2);

        DrinkMaker drinkMaker = new DrinkMaker();

        drinkMaker.makeCommand(drink1.getCommand(), 1F);
        drinkMaker.makeCommand(drink2.getCommand(), 2F);

        drinkMaker.report();
    }
}

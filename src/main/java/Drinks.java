public enum Drinks {

    Tea("Tea", "T", 0.4F),
    Coffee("Coffee", "C", 0.6F),
    Chocolate("Chocolate", "H", 0.5F),

    Orange("Orange", "O", 0.6F),

    ExtraHotTea("Extra Hot Tea", "Th", 0.4F),
    ExtraHotCoffee("Extra Hot Coffee", "Ch", 0.6F),
    ExtraHotChocolate("Extra Hot Chocolate", "Hh", 0.5F);

    private final String label;
    private final String code;
    private final Float price;

    private Drinks(String label, String code, Float price) {
        this.label = label;
        this.code = code;
        this.price = price;
    }
    public String getLabel() {
        return label;
    }

    public String getCode() {
        return code;
    }

    public Float getPrice() {
        return price;
    }
}

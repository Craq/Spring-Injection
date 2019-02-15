public class Grocery {
    private static String product;
    private static Integer quantity;
    private static Float maxPrice;
    public Grocery(String product,Integer quant, Float maxPrice){
        this.product = product;
        this.quantity = quant;
        this.maxPrice = maxPrice;
    }
    public void groceryInfo(){
        try {
            System.out.println("Product: " + product + " - " + quantity + " for a maximum of " + maxPrice + "$");
        } catch(NullPointerException e){
            System.out.println("Incomplete product information.");
        }
    }
}

public class GroceryDescription {
    private String name;
    private String description;
    private Integer daysToExpire;
    private Integer daysSinceProduced;
    private Integer inStock;
    private Float price;

    public void productDescription(){
        try{
            System.out.println("Name: "+name+".");
            System.out.println("Description: "+description+".");
            System.out.println("Days in store: "+daysSinceProduced+".");
            System.out.println("Days until expired: "+daysToExpire+".");
            System.out.println("Quantity: "+inStock+".");
            System.out.println("Price: "+price+".");
        }
        catch(NullPointerException e){
            System.out.println("Not enough information");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setDaysToExpire(Integer daysToExpire){
        this.daysToExpire = daysToExpire;
    }
    public void setDaysSinceProduced(Integer daysSinceProduced){
        this.daysSinceProduced = daysSinceProduced;
    }
    public void setInStock(Integer inStock){
        this.inStock = inStock;
    }
    public void setPrice(Float price){
        this.price = price;
    }

}

import java.util.List;

public class GroceryList {
    private List<Grocery> groceries;

    public void setGroceries(List<Grocery> groceries){
        this.groceries = groceries;
    }
    public void printGroceries(){
        for(Grocery g: groceries){
            g.groceryInfo();
        }
    }
}

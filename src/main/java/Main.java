import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

        Grocery grocery=(Grocery)app.getBean("grocery");
        grocery.groceryInfo();

        GroceryDescription groceryDescription = (GroceryDescription)app.getBean("groceryDescription");
        groceryDescription.productDescription();

        GroceryList groceryList = (GroceryList)app.getBean("groceryList");
        groceryList.printGroceries();
    }
}
package mypack;
import java.io.Serializable;

//searializable is used for saving purposes
public class Expense implements Serializable 
{
    private String type;        // Income or Expense
    private double amount;
    private String category;    //type of income or expense
    private String date;
    
    public Expense(String type, double amount, String category, String date) 
    {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public String getType() {return type; }
    public double getAmount()   { return amount; }
    public String getCategory() { return category; }
    public String getDate() { return date; }

    @Override
    // to convert data elements to string
    public String toString() 
    {
        return String.format("%-10s | %-10s    | %-10.2f    | %-15s", date, type, amount, category);
    }
}

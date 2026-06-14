package mypack;

import java.io.*;
import java.util.*;

public class ExpenseManager 
{
    private List<Expense> expenses;
    private final String FILE_NAME = "expenses.dat";

    public ExpenseManager() 
    {
        expenses = loadExpenses();
        //loads previously saved expenses
    }
    
    // Add expense
    public void addExpense(Expense e) 
    {
        expenses.add(e);
        saveExpenses();
    }
    
    // Delete expense by index
    public void deleteExpense(int index) 
    {
        if (index >= 0 && index < expenses.size()) 
        {
            expenses.remove(index);
            System.out.printf("Index %d deleted",index);
            saveExpenses();
        } 
        else 
        {
            System.out.println("Invalid index!");
        }
    }

    // View all expenses
    public void viewExpenses() 
    {
        if (expenses.isEmpty()) 
        {
            System.out.println("No expenses found!");
            return;
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("DATE          | TYPE          | AMOUNT        | CATEGORY");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < expenses.size(); i++) 
        {
            System.out.println((i + 1) + ". " + expenses.get(i));
        }
        System.out.println("----------------------------------------------------------");
    }

 //showSummary()
    public void showSummary() 
    {
        double totalIncome = 0.0;
        double totalExpense = 0.0;
        Map<String, Double> categoryMap = new LinkedHashMap<>(); 
        // keeps insertion order

        for (Expense e : expenses) 
        {
            // defensive checks
            String type = e.getType() == null ? "" : e.getType().trim(); 
            // trim whitespace
            String category = e.getCategory() == null ? "Uncategorized" : e.getCategory().trim();

            // normalize type for comparison
            //to standardize
            if (type.equalsIgnoreCase("income") || type.equalsIgnoreCase("inc") || type.equalsIgnoreCase("i")) 
            {
                totalIncome += e.getAmount();
            } 
            else 
            {
                // treat anything else as expense (you could also explicitly check for "expense")
                totalExpense += e.getAmount();
            }

            categoryMap.put(category, categoryMap.getOrDefault(category, 0.0) + e.getAmount());
        }

        double balance = totalIncome - totalExpense;

        System.out.println("\n========== SUMMARY ==========");
        System.out.printf("Total Income  : %.2f\n", totalIncome);
        System.out.printf("Total Expense : %.2f\n", totalExpense);
        System.out.printf("Net Balance   : %.2f\n", balance);
        System.out.println("\nCategory-wise Breakdown:");
        for (Map.Entry<String, Double> entry : categoryMap.entrySet()) 
        {
            System.out.printf("%-15s : %.2f\n", entry.getKey(), entry.getValue());
        }
        System.out.println("==============================\n");

        if (balance < 0)
            System.out.println(" Your wallet’s crying for help rn. ");
        else if (totalIncome > 0 && balance < totalIncome * 0.2)
            System.out.println(" Financially stable? Kinda. Emotionally? Still working on it. ");
        else
            System.out.println(" Financial glow-up complete — broke who?  ");
    }

    // File I/O
    @SuppressWarnings("unchecked")
    private List<Expense> loadExpenses() 
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) 
        {
            return (List<Expense>) ois.readObject();
        } 
        catch (Exception e) 
        {
            return new ArrayList<>();
        }
    }

    private void saveExpenses() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            oos.writeObject(expenses);
        } 
        catch (IOException e) 
        {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
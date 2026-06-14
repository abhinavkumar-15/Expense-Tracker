package mypack;
import java.util.*;

public class ExpenseTracker 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        int choice;

        do {
            System.out.println("\n=== EXPENSE TRACKER ===");
            System.out.println("1. Add Entry");
            System.out.println("2. View All Entries");
            System.out.println("3. Delete Entry");
            System.out.println("4. Show Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1 : {
                    		System.out.print("Enter Type (Income/Expense): ");
                    		String type = sc.nextLine();
                    
                            System.out.print("Enter Amount: ");
		                    double amount = sc.nextDouble();
		                    sc.nextLine();
		                    
		                    System.out.print("Enter Category: ");
		                    String category = sc.nextLine();
		                    
		                    System.out.print("Enter Date (DD/MM/YYYY): ");
		                    String date = sc.nextLine();
		
		                    Expense e = new Expense(type, amount, category, date);
		                    manager.addExpense(e);
                    
		                    System.out.println("Entry Added Successfully!");
                } break;

                case 2 : manager.viewExpenses(); break;

                case 3 : {
		                    manager.viewExpenses();
		                    System.out.print("Enter index to delete: ");
		                    int idx = sc.nextInt();
		                    manager.deleteExpense(idx - 1);
                } break;

                case 4 : manager.showSummary(); break;

                case 5 : System.out.println("Bye, don’t go broke trying to look rich."); break;

                default : System.out.println("You had 5 choices and somehow made up your own."); break;
            }

        } while (choice != 5);
        sc.close();
    }
}


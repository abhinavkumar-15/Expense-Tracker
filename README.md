# Expense Tracker

A console-based Expense Tracker application built using Java that helps users manage their personal finances by recording income and expenses, viewing transaction history, deleting entries, and generating financial summaries.

The project demonstrates Object-Oriented Programming (OOP), Java Collections, File Handling, Serialization, and Exception Handling.

---

## Features

### Add Financial Entries
Users can record both income and expense transactions by providing:

- Transaction Type (Income/Expense)
- Amount
- Category
- Date

### View All Entries
Displays all saved transactions in a structured tabular format.

### Delete Entries
Allows users to remove transactions using their index number.

### Financial Summary
Generates:

- Total Income
- Total Expenses
- Net Balance
- Category-wise Breakdown

### Data Persistence
All transactions are automatically stored using Java Serialization and remain available even after the application is restarted.

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- File Handling
- Serialization
- Exception Handling

---

## Project Structure

```text
Expense-Tracker
│
├── README.md
│
└── src
    └── mypack
        ├── Expense.java
        ├── ExpenseManager.java
        └── ExpenseTracker.java
```

### Expense.java

Represents a single financial transaction.

Stores:

- Type
- Amount
- Category
- Date

Implements `Serializable` to support data persistence.

### ExpenseManager.java

Handles all business logic:

- Add Entries
- Delete Entries
- View Entries
- Generate Financial Summaries
- Save Data
- Load Data

### ExpenseTracker.java

Contains the menu-driven user interface and manages user interaction.

---

## How It Works

1. The application starts.
2. Existing records are loaded from `expenses.dat`.
3. Users select an operation from the menu.
4. Data is automatically saved whenever changes are made.
5. Records remain available across multiple sessions.

---

## Sample Menu

```text
=== EXPENSE TRACKER ===

1. Add Entry
2. View All Entries
3. Delete Entry
4. Show Summary
5. Exit
```

---

## Sample Output

```text
========== SUMMARY ==========

Total Income  : 50000.00
Total Expense : 27500.00
Net Balance   : 22500.00

Category-wise Breakdown:

Salary          : 50000.00
Food            : 4500.00
Travel          : 8000.00
Shopping        : 15000.00
```

---

## Learning Outcomes

This project strengthened my understanding of:

- Classes and Objects
- Encapsulation
- Constructors
- Java Collections
- Serialization
- File Handling
- Exception Handling
- Data Persistence
- Menu-Driven Applications

---

## Future Enhancements

- Graphical User Interface (JavaFX/Swing)
- Monthly and Yearly Reports
- Search and Filter Functionality
- Budget Planning and Alerts
- CSV/Excel Export
- Expense Analytics and Charts
- Database Integration (MySQL/PostgreSQL)

---

## Authors

**Abhinav Kumar** - Team Lead,
**Sai Vaishnavi**, 
**Kodati Sheetal**, 
**Dev Manikanta**


Undergraduate Student

Interested in Software Development, Artificial Intelligence, Bioinformatics, and Building Real-World Applications with Java.

# \# Expense Tracker

# 

# A console-based Expense Tracker application developed in Java that helps users manage their personal finances by recording income and expenses, viewing transaction history, deleting entries, and generating financial summaries.

# 

# The project demonstrates object-oriented programming concepts, file handling, serialization, collections, and basic financial data analysis.

# 

# \---

# 

# \## Features

# 

# \### Add Financial Entries

# 

# Users can add both income and expense records by providing:

# 

# \* Transaction Type (Income/Expense)

# \* Amount

# \* Category

# \* Date

# 

# \### View All Entries

# 

# Displays all stored transactions in a structured tabular format.

# 

# \### Delete Entries

# 

# Allows users to remove transactions using their corresponding index.

# 

# \### Financial Summary

# 

# Generates:

# 

# \* Total Income

# \* Total Expenses

# \* Net Balance

# \* Category-wise Breakdown

# 

# \### Data Persistence

# 

# All transactions are automatically saved to a local file using Java Serialization.

# 

# Data remains available even after restarting the application.

# 

# \---

# 

# \## Technologies Used

# 

# \* Java

# \* Object-Oriented Programming (OOP)

# \* Java Collections Framework

# \* File Handling

# \* Serialization

# \* Exception Handling

# 

# \---

# 

# \## Project Structure

# 

# ```text

# src/

# └── mypack/

# &#x20;   ├── Expense.java

# &#x20;   ├── ExpenseManager.java

# &#x20;   └── ExpenseTracker.java

# ```

# 

# \### Expense.java

# 

# Represents a single financial transaction.

# 

# Stores:

# 

# \* Type

# \* Amount

# \* Category

# \* Date

# 

# Implements Serializable to allow object persistence.

# 

# \### ExpenseManager.java

# 

# Handles all business logic:

# 

# \* Add entries

# \* Delete entries

# \* View entries

# \* Generate summaries

# \* Load saved data

# \* Save data

# 

# \### ExpenseTracker.java

# 

# Contains the main menu-driven user interface and manages user interaction.

# 

# \---

# 

# \## How It Works

# 

# 1\. Application starts.

# 2\. Existing transactions are loaded from `expenses.dat`.

# 3\. User selects an operation:

# 

# &#x20;  \* Add Entry

# &#x20;  \* View Entries

# &#x20;  \* Delete Entry

# &#x20;  \* Show Summary

# &#x20;  \* Exit

# 4\. Data is automatically saved after every modification.

# 

# \---

# 

# \## Sample Menu

# 

# ```text

# === EXPENSE TRACKER ===

# 

# 1\. Add Entry

# 2\. View All Entries

# 3\. Delete Entry

# 4\. Show Summary

# 5\. Exit

# ```

# 

# \---

# 

# \## Sample Summary Output

# 

# ```text

# ========== SUMMARY ==========

# 

# Total Income  : 50000.00

# Total Expense : 27500.00

# Net Balance   : 22500.00

# 

# Category-wise Breakdown:

# 

# Salary          : 50000.00

# Food            : 4500.00

# Travel          : 8000.00

# Shopping        : 15000.00

# ```

# 

# \---

# 

# \## Learning Outcomes

# 

# This project helped strengthen understanding of:

# 

# \* Classes and Objects

# \* Encapsulation

# \* Constructors

# \* Collections (ArrayList, Map)

# \* Serialization

# \* File Handling

# \* Exception Handling

# \* Menu-Driven Applications

# \* Data Persistence

# 

# \---

# 

# \## Future Improvements

# 

# Possible enhancements include:

# 

# \* GUI using JavaFX or Swing

# \* Monthly and yearly reports

# \* Expense filtering by date

# \* Search functionality

# \* Budget planning and alerts

# \* Export data to CSV or Excel

# \* Graphical analytics and charts

# \* Database integration using MySQL

# 

# \---

# 

# \## Authors

# 

# Abhinav Kumar - Team Lead

# Sai Vaishnavi

# Kodati Sheetal

# Dev Manikanta









# 

# Undergraduate Student

# 

# Interested in Artificial Intelligence, Machine Learning models, Deep Learning and Building Practical Applications.




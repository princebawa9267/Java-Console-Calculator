# Java-Console-Calculator

# 🧮 Java Calculator

A simple **menu-driven calculator** built in **Java** using **OOP concepts, methods, conditionals, loops, and I/O**.  
This program demonstrates modular design by separating calculation logic into a separate class (`CalculationTask`).

---

## 🚀 Features
- Addition (+)
- Subtraction (−)
- Multiplication (×)
- Division (÷) with error handling
- Modulus (%)
- Power (a^b)
- Square Root (√a)
- Exit option

---

## 📂 Project Structure

├── Main.java # Handles user input and menu system

├── CalculationTask.java # Contains methods for arithmetic operations

└── README.md # Project documentation


---

## 🛠️ How It Works
- The program shows a menu of operations in a loop.
- User selects an operation (1–8).
- For operations 1–6, two numbers are taken as input.
- For square root, only one number is needed.
- The respective method from `CalculationTask` is called.
- The result is printed on the console.
- The program continues until the user selects **Exit (8)**.

---

## 💻 Example Usage

------------------------ Welcome to Calculator ------------------------



------------- Choose from these options 1-8 -------------

1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulus (%)
6. Power (a^b)
7. Square Root
8. Exit
5
Enter first number: 12
Enter second number: 8
12.00 % 8.00 = 4.00 


---

## 📌 Key Concepts Demonstrated
- **OOP (Object-Oriented Programming)**: 
  - Operations are encapsulated in a separate `CalculationTask` class.
- **Methods**: Each operation is a separate method.
- **Conditionals**: `if-else` used for square root & exit handling.
- **Loops**: `do-while` used to repeat the menu until exit.
- **I/O**: `Scanner` is used for user input.


## ⚠️ Note About InputMismatchException
While using this calculator, you may encounter the following error if you try to run the program **again without exiting the previous instance**:

Exception in thread "main" java.util.InputMismatchException

This occurs because the program expects an **integer input** for menu choices, and running multiple instances or providing unexpected input can cause `Scanner.nextInt()` to fail.  

**Solution:**  
- Always **exit the previous program** properly before running a new instance.  
- Alternatively, safer input handling using `Scanner.nextLine()` and `Integer.parseInt()` can prevent this issue.  

💡 This solution was provided with the help of **ChatGPT** to improve the robustness of the program.


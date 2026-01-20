# Task 2: Variables, Data Types & Console Input Application

## Objective
To understand and implement Java variables, data types, console input, 
and control flow by creating a menu-driven calculator application.

---

## Application Overview
This is a **console-based calculator** that performs basic arithmetic
operations using a menu-driven approach.  
The program demonstrates:
- User input using `Scanner`
- Arithmetic operations
- Control structures (`while`, `switch`)
- Variable scope (local, instance, static)
- Proper data type usage with comments

---

## Features
- Menu-driven calculator
- Operations supported:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Exit option using menu
- Handles divide-by-zero condition
- Uses clean and readable code structure

---

## Concepts Demonstrated

### 1. Types of Variables in Java

#### 🔹 Local Variables
- Declared inside methods
- Accessible only within the method
- Examples:
  - `choice`
  - `num1`
  - `num2`



#### 🔹 Static Variables
- Declared using `static` keyword
- Shared among all objects of the class
- Example:
  

---

## Data Types Used & Reason

| Data Type | Variable | Reason |
|---------|--------|-------|
| `int` | menu choice, operation count | Whole numbers only |
| `double` | calculator numbers | Supports decimal values |
| `String` | application name | Used for text |
| `Scanner` | input handling | Reads input from console |

---

## Control Structures Used
- `while(true)` loop to continuously display menu
- `switch-case` to handle user-selected operations
- `if-else` for exit option and division validation

---
#author BABU SANGALE^^
javac CalculatorLaunch.java
java CalculatorLaunch

Sure — here is a clean **README.md** for your Java ATM project.

# 🏧 ATM Banking System – Java

A simple **ATM Banking System** developed using **Java**. This project demonstrates basic Object-Oriented Programming (OOP) concepts such as **classes, objects, constructors, encapsulation, methods, and conditional statements**.

## 📌 Project Overview

The ATM Banking System allows a user to:

* 🔐 Login using an Account Number and PIN
* 💰 Check account balance
* 💵 Deposit money
* 🏦 Withdraw money
* 🚪 Exit the ATM system

The project contains three main classes:

* `BankAccount` – Handles account details and banking operations.
* `ATM` – Handles user interaction and ATM menu.
* `Decodelabs_java_P3` – Main class used to start the application.

## 🛠️ Technologies Used

* **Java**
* **Java Scanner Class**
* **Object-Oriented Programming (OOP)**

## 📂 Project Structure

```text
Decodelabs_java_P3/
│
├── Decodelabs_java_P3.java
└── README.md
```

## 🔑 Sample Login Details

The program contains a sample bank account:

```text
Account Number: 12345
PIN: 1234
Initial Balance: Rs.10000
```

## ⚙️ Features

### 1. Login Validation

The user must enter the correct account number and PIN.

```text
Enter Account Number: 12345
Enter PIN: 1234

Login successful!
Welcome to your account.
```

If incorrect details are entered:

```text
Invalid account number or PIN.
Login failed.
```

### 2. Check Balance

The user can check the available account balance.

```text
Available balance: Rs.10000.0
```

### 3. Deposit

The user can deposit a positive amount into the account.

Example:

```text
Enter deposit amount: Rs.2000
Amount deposited successfully.
New balance: Rs.12000.0
```

The program rejects zero or negative deposit amounts.

### 4. Withdraw

The user can withdraw money if sufficient balance is available.

Example:

```text
Enter withdrawal amount: Rs.3000
Please collect your cash.
Remaining balance: Rs.9000.0
```

If the withdrawal amount is greater than the balance:

```text
Insufficient balance.
```

### 5. Exit

Selecting option `4` exits the ATM.

```text
Thank you for using the ATM.
```

## 🧠 OOP Concepts Used

### Encapsulation

Account details such as account number, PIN, and balance are declared as `private`.

```java
private int accountNumber;
private int pin;
private double balance;
```

### Constructor

The `BankAccount` constructor initializes the account details.

```java
BankAccount(int accountNumber, int pin, double balance)
```

### Classes and Objects

The project uses separate classes for different responsibilities.

```java
BankAccount account = new BankAccount(12345, 1234, 10000);
```

```java
ATM atm = new ATM();
```

### Methods

Different methods perform different banking operations:

```text
login()
deposit()
withdraw()
checkBalance()
start()
```

### Conditional Statements

`if-else` statements are used for:

* Login validation
* Validating deposit amounts
* Checking sufficient balance
* Validating withdrawal amounts

### Switch Statement

A `switch` statement is used to handle ATM menu choices.

```java
switch (choice)
```

### Do-While Loop

The ATM menu continues to appear until the user selects **Exit**.

```java
do {
    // ATM menu
} while (choice != 4);
```

## ▶️ How to Run

### Step 1: Install Java

Make sure Java/JDK is installed on your computer.

Check using:

```bash
java -version
```

### Step 2: Open the Project Folder

Open the folder containing:

```text
Decodelabs_java_P3.java
```

### Step 3: Compile the Program

Open Command Prompt or Terminal in that folder and run:

```bash
javac Decodelabs_java_P3.java
```

### Step 4: Run the Program

```bash
java Decodelabs_java_P3
```

## 💻 Sample Output

```text
================================
       WELCOME TO ATM
================================
Enter Account Number: 12345
Enter PIN: 1234

Login successful!
Welcome to your account.

========== ATM MENU ==========
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
==============================
Enter your choice: 1

Available balance: Rs.10000.0

========== ATM MENU ==========
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
==============================
Enter your choice: 2

Enter deposit amount: Rs.5000
Amount deposited successfully.
New balance: Rs.15000.0

========== ATM MENU ==========
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
==============================
Enter your choice: 3

Enter withdrawal amount: Rs.2000
Please collect your cash.
Remaining balance: Rs.13000.0

========== ATM MENU ==========
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
==============================
Enter your choice: 4

Thank you for using the ATM.
```

## 🎯 Learning Objectives

This project helps beginners understand:

* Java classes and objects
* Constructors
* Encapsulation
* Methods
* `if-else` conditions
* `switch` statements
* `do-while` loops
* User input using `Scanner`
* Basic banking operations
* Object-oriented programming principles

## 🚀 Future Enhancements

The project can be improved by adding:

* Multiple bank accounts
* Multiple login attempts
* PIN change option
* Transaction history
* Money transfer
* Account creation
* Receipt generation
* Date and time for transactions
* File/database storage
* Improved security

## 👩‍💻 Author

**Gajula Thirushma**

B.Tech – Computer Science Engineering

## 📄 License

This project is created for **educational and learning purposes**.

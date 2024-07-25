

### README.md

```markdown
# Java Bank Account and Product Management

## Overview

This project includes two main parts: a `BankAccount` class for managing bank accounts and a `Product` class for managing product details. The project demonstrates object-oriented programming principles, including encapsulation, method creation, and object interaction.

## Features

### BankAccount Class
- **Attributes:** Account holder's name and account balance.
- **Methods:**
  - `deposit(double amount)`: Deposits a specified amount into the account.
  - `withdraw(double amount)`: Withdraws a specified amount from the account.
  - `toString()`: Prints the account holder's name and balance.

### Product Class
- **Attributes:** Product name, cost per unit, and quantity.
- **Methods:**
  - `totalCost()`: Calculates and prints the total cost for the specified quantity of products.
  - `printProduct()`: Prints the cost per unit and the quantity of the product.

## Project Structure

```
├── src
│   └── main
│       └── java
│           └── org
│               └── example
│                   ├── BankAccount.java
│                   └── Product.java
└── README.md
```

## BankAccount Usage

### Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/java-bank-product-management.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd java-bank-product-management
   ```

3. **Compile the project:**

   ```bash
   javac -d out src/main/java/org/example/*.java
   ```

4. **Run the project:**

   ```bash
   java -cp out org.example.BankAccount
   ```

### Example Interaction for BankAccount

```java
public static void main(String[] args) {
    // Create two accounts
    BankAccount account1 = new BankAccount("Alice", 5000);
    BankAccount account2 = new BankAccount("Bob", 300);

    // Withdraw $100 from the first account
    account1.withdraw(100);

    // Deposit $100 to the second account
    account2.deposit(100);

    // Print account details
    System.out.println(account1);
    System.out.println(account2);
}
```

#### Output

```
Account Holder: Alice
Balance: $4900.0
Account Holder: Bob
Balance: $400.0
```

## Product Usage

### Setup

1. **Compile the project:**

   ```bash
   javac -d out src/main/java/org/example/*.java
   ```

2. **Run the project:**

   ```bash
   java -cp out org.example.Product
   ```

### Example Interaction for Product

```java
public static void main(String[] args) {
    // Instantiate a Product object
    Product product = new Product("Laptop", 799.99, 2);

    // Call the printProduct and totalCost methods
    product.printProduct();
    product.totalCost();
}
```

#### Output

```
Product: Laptop
Cost per unit: $799.99
Quantity: 2
Total cost for 2 units of Laptop is $1599.98
```

## Contributing

If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are welcome.

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for more information.
```

This README file provides an overview of the project, setup instructions, usage examples, and contribution guidelines. It should help anyone understand and work with your project effectively.

## Fast Food Restaurant Management System
A Java-based console application designed to automate the ordering process for a fast-food establishment. This system allows users to browse a digital menu, customize their orders, and receive an instant billing summary including taxes or discounts.
## Key Features
* Interactive Menu: A categorized display of food items and beverages with real-time pricing.
* Order Customization: Ability to select quantities and add specific items to a
* Automated Billing: Instant calculation of the total bill, including subtotal, applicable taxes, and final payable amount.
* Receipt Generation: Displays a clean, formatted summary of the order for the customer.
## Technical Implementation
The project utilizes core Java functionalities to ensure a smooth user experience:
* Control Flow: Uses while loops for continuous ordering and switch-case statements for menu selection.
* Data Structures: Uses arrays or lists to store menu items and pricing for easy updates.
* Input Handling: Leverages the Scanner class to capture customer choices and quantities.
* Arithmetic Logic: Implements precise mathematical logic for calculating totals and applying tax percentages.
## Setup and Installation
### Prerequisites
* Java Development Kit (JDK): Version 8 or newer.
* Terminal/IDE: Any environment capable of running Java (VS Code, IntelliJ, Eclipse).
### Execution Steps
1. Clone the repository:
```Bash```
git clone https://github.com/Haniatahir05/FastFoodRestaurant.git
```Bash```
2. Navigate to the project directory:
```Bash```
cd FastFoodRestaurant
```Bash```
3. Compile the Java file:
```Bash```
javac FastFoodRestaurant.java
```Bash```
4. Run the application:
```Bash```
java FastFoodRestaurant
```Bash```
## Sample Workflow
1. Welcome Screen: The system greets the user and displays the menu.
2. Selection: User enters the code/number corresponding to their desired food item.
3. Quantity: User specifies how many units they wish to purchase.
4. Checkout: User chooses to finish ordering, and the system prints the final receipt.

## Future Improvements
* Adding a Login system for restaurant administrators to update prices.
* Developing a Graphical User Interface (GUI) for a more modern "Kiosk" feel.
* Support for multiple payment methods (Cash, Card, Digital Wallets).

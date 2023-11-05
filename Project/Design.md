# Online Retailer Order Management Program
This program was put together as a final project in the CSU Global 2023 Fall C course CSC400: Data Structures and Algorithms.

## Program Design Prompt & Requirements
The following was the given prompt for this project.

*Write a program that handles the order list for an online retailer. Your program should contain a minimum of three classes:*
- ***Order Class*** - *Create a Order Class that uses a queue to hold the orders in the order they were taken. The queue should contain the customer last name, order number, and order total cost.*
- ***Display Class*** - *Create a Display Class that will store a copy of the order queue in two arrays. Each array will contain the order list but one will be sorted by name and the other sorted by order number. When a order is taken and stored in the Order Class the program will update the Display Class arrays automatically sort them in descending order using quick sort and outputs the the contents to the console upon each entry of new data.*
- ***Main Class*** - *Create a Main Class that will handle operator data input and when an order is added or removed, the program will update the Order Class and Display Class. The user will be presented a menu to add a order, remove a order and display the order list from the queue.*

From this design prompt the following requirements were identified. Left checkmark is whether the requirement is addressed in Pseudocode, right checkmark is whether the requirement has been addressed in the code.
* :check_mark_button: Orders will need to be placed in a queue for the orders
    * [ ] Orders must be stored in this queue in the order they were received
* [ ] Orders entered have to have specific information
    * [ ] Last name of the individual ordering
    * [ ] Number of the order
    * [ ] Order total
* [ ] Display class holds the order queue in two separate arrays
    * [ ] First array has the orders ordered by last name
    * [ ] Second array has the orders ordered by number
    * [ ] Updates to the display class are output to the console when they are made
* [ ] Order class will update the display class arrays when orders are changed
    * [ ] When orders are removed, the display arrays update
    * [ ] When orders are added, the display arrays update
    * [ ] Ordering is done by quick sort algorithm
    * [ ] Sorted in descending order in the sorted arrays
* [ ] Interface class handles the user interacting with the classes
    * [ ] Users need a menu to select what they want to do
    * [ ] Presented a menu to add a particular order to the queue
    * [ ] They are presented with an option to remove an order from the queue

## Program Design
Given the above prompt, the following design specifications were made to build the program.

### Program Class Relationship
Below is how the classes relate to one another within the program.

```Mermaid
flowchart
Start[/"User selects order"/]-->Order
Order-->OrderQueue["Order Queue"]
OrderQueue<-->UserRemove[\"User remove order"\]
OrderQueue<-->UserUpdate[\"User update order"\]
DisplayQueues-->NameSortQueue[["Last Name Sorted"]]
DisplayQueues-->OrderSortQueue[["Order Sorted"]]
OrderQueue-->DisplayQueues
OrderQueue-->OrderStrgQueue[["Order Queue"]]
```

The following are the explanations of the classes for the program.
* **Order** - the class of object that is individual orders that are added to the menu.
* **OrderQueue** - the class of object that is used for storing and managing the different orders that are submitted.
* **DisplayQueue** - the class of object that is used for storing and managing the order queue in various sorting arrangements.

### Program Pseudocode
The following Pseudocode has been created for the various classes of the program and the operational program.

#### Order Class
```
class Order
    int orderNum
    string lastName
    float cost
```

#### OrderQueue Class
```
class OrderQueue
    Order[] orderQueue
    int orderCount
```

#### DisplayQueues Class
```
class DisplayQueue
    Order[] lastNameQueue
    Order[] orderNumQueue
```

#### UserInterface Class
```
class UserInterface
    String userInput
    Scanner userScanner
    String[] userInputArray
```
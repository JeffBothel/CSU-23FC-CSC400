# Online Retailer Order Management Program
This program was put together as a final project in the CSU Global 2023 Fall C course CSC400: Data Structures and Algorithms.

## Program Design Prompt & Requirements
The following was the given prompt for this project.

*Write a program that handles the order list for an online retailer. Your program should contain a minimum of three classes:*
- ***Order Class*** - *Create a Order Class that uses a queue to hold the orders in the order they were taken. The queue should contain the customer last name, order number, and order total cost.*
- ***Display Class*** - *Create a Display Class that will store a copy of the order queue in two arrays. Each array will contain the order list but one will be sorted by name and the other sorted by order number. When a order is taken and stored in the Order Class the program will update the Display Class arrays automatically sort them in descending order using quick sort and outputs the the contents to the console upon each entry of new data.*
- ***Main Class*** - *Create a Main Class that will handle operator data input and when an order is added or removed, the program will update the Order Class and Display Class. The user will be presented a menu to add a order, remove a order and display the order list from the queue.*

From this design prompt the following requirements were identified. Left checkmark is whether the requirement is addressed in Pseudocode, right checkmark is whether the requirement has been addressed in the code.\
:white_square_button: = Needed\
:white_check_mark: = Added\
:heavy_exclamation_mark: = Problems

* :white_square_button: :white_square_button: Orders will need to be placed in a queue for the orders
    * :white_square_button: :white_square_button: Orders must be stored in this queue in the order they were received
* :white_square_button: :white_square_button: Orders entered have to have specific information
    * :white_square_button: :white_square_button: Last name of the individual ordering
    * :white_square_button: :white_square_button: Number of the order
    * :white_square_button: :white_square_button: Order total
* :white_square_button: :white_square_button: Display class holds the order queue in two separate arrays
    * :white_square_button: :white_square_button: First array has the orders ordered by last name
    * :white_square_button: :white_square_button: Second array has the orders ordered by number
    * :white_square_button: :white_square_button: Updates to the display class are output to the console when they are made
* :white_square_button: :white_square_button: Order class will update the display class arrays when orders are changed
    * :white_square_button: :white_square_button: When orders are removed, the display arrays update
    * :white_square_button: :white_square_button: When orders are added, the display arrays update
    * :white_square_button: :white_square_button: Ordering is done by quick sort algorithm
    * :white_square_button: :white_square_button: Sorted in descending order in the sorted arrays
* :white_square_button: :white_square_button: Interface class handles the user interacting with the classes
    * :white_square_button: :white_square_button: Users need a menu to select what they want to do
    * :white_square_button: :white_square_button: Presented a menu to add a particular order to the queue
    * :white_square_button: :white_square_button: They are presented with an option to remove an order from the queue

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
* **DisplayQueues** - the class of object that is used for storing and managing the order queue in various sorting arrangements.
* **UserInterface** - the class of object that is used for starting and running the program and that manages the interface of the user.

### Program Pseudocode
The following Pseudocode has been created for the various classes of the program and the operational program.

#### Order Class
```
class Order
    int orderNum
    string lastName
    float cost

    public Order()
    public Order(int num, string lastName, float cost)
        this.orderNum = num
        this.lastName = lastName
        this.cost = cost

    public int GetOrderNumber()
        return this.orderNum

    public String GetOrderName()
        return this.lastName
```

#### OrderQueue Class
```
class OrderQueue
    int orderCount
    Order[] orderQueue
    DisplayQueue displays

    public OrderQueue()

    public OrderQueue GetQueue()

    public GetOrder()
    public GetOrder(int index)

    public AddOrder(Order inOrder)

    public CompleteOrder()

    public GetByName()
        displays.GetByName()

    public GetByNumber()
        displays.GetByNumber()
```

#### DisplayQueues Class
```
class DisplayQueue
    Order[] lastNameQueue
    Order[] orderNumQueue

    private buildQueues(OrderQueue inOrders)
        int pivotIndex
        lastNameQueue = inOrders
        orderNumQueue = inOrders

        if(inOrders != null)
        else return
    
    private Order[] sortQueues(Order[] queue, boolean sortByName)
        int pivotIndex
        Order temp
        Order[] left = queue.length
        Order[] right = queue.length
        Order[] combined = queue.length
        
        if(queue.length%2 == 0) pivotIndex = (queue.length/2) - 1
        else pivotIndex = (queue.length/2)

        i = 0
        ii = 0
        while(i <= pivotIndex)
            left[i] = queue[ii]
            i++
            ii++

        i = 0
        while(ii <= )
            right[i] = queue[ii]
            i++
            ii++

        i = 0
        while(i < left.length -1)
            if(!sortByName and left[i].GetOrderNumber() > left[i+1].GetOrderNumber())
                temp = left[i]
                left[i] = left[i+1]
                left[i+1] = temp
            if(sortByName and left[i].GetOrderName() > left[i+1].GetOrderName())
                temp = left[i]
                left[i] = left[i+1]
                left[i+1] = temp
            else i++

        while(i < right.length -1)
            if(!sortByName and right[i].GetOrderNumber() > right[i+1].GetOrderNumber())
                temp = right[i]
                right[i] = right[i+1]
                right[i+1] = temp
            if(sortByName and right[i].GetOrderName() > right[i+1].GetOrderName())
                temp = right[i]
                right[i] = right[i+1]
                right[i+1] = temp
            else i++

        i = 0
        ii = 0
        for(order in left)
            combined[i] = left[ii]
            i++
            ii++

        ii = 0
        for(order in right)
            combined[i] = right[ii]
            i++
            ii++

        return combined

    public DisplayQueue()
        buildQueue(null)

    public void UpdateQueue(OrderQueue inOrders)
        buildQueues(inOrders)

    public String GetByNumber()
        outputStr = ""
        for(order in orderNumQueue)
            outputStr += order.toString() + \n
        return outputStr
            
    public String GetByName()
        outputStr = ""
        for(order in lastNameQueue)
            outputStr += order.toString() + \n
        return outputStr
```

#### UserInterface Class
```
class UserInterface
    String userInput
    Scanner userScanner
    String[] userInputArray
```
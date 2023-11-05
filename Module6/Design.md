# Confirmation of Array Sorted
This program was put together as a course deliverable for CSU Global 2023 Fall C term course CSC400: Data Structures & Algorithms.

## Program Design Prompt && Requirements
The following prompt was provided to create a program from.

*Devise an algorithm that detects whether a given array is sorted into ascending order. Write a java method that implements your algorithm. You can use your method to test whether a sort method has executed correctly.*

From this prompt, the following requirements were identified as necessary for this program. Left box is if the requirement is written in the pseudocode. Right box is if the requirement has been implemented in the code.\
:white_square_button: = Needed\
:white_check_mark: = Added\
:heavy_exclamation_mark: = Problems

* :white_check_mark: :white_check_mark: Algorithm detecting ascending order
* :white_check_mark: :white_check_mark: Implement the sort check algorithm

## Program Design
Given the above prompt, the following design specifications were made to build the program.

### Program Pseudocode 
``` 
method TestAscendingSort(int[] arr) returns boolean response
    for(i < arr.length)
        if(arr[i] > arr[i+1])
            return false

    return true

method main(String[] args)
    print program introduction
    create 7 test arrays
    output results for 7 test arrays
```
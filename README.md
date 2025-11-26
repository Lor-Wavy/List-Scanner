# List-Scanner
A program that allows an user to input a number and the program scans the number to see if it is in the predetermined list.


Java Array Sorting and Searching Demo

This project is a simple, single-file Java application (Main.java) designed to demonstrate two fundamental computer science algorithms: Selection Sort and Binary Search.

The program initializes an array of integers, sorts it, and then allows the user to search for a specific value.

🚀 Purpose

The primary goal of this code is educational: to show the application and behavior of standard array manipulation algorithms in Java.

Before Sort: Displays the initial, unsorted state of the integer array.

After Sort: Displays the array after the selectionSort algorithm has been applied.

Search: Prompts the user for a number and uses the binarySearch algorithm to quickly find its index (or report if it's not present).

✨ Features

The application is implemented within a single class (Main) and includes four static methods:

1. main(String[] args)

The entry point of the program. It initializes the data, calls the sort and display methods, and handles user input for the search function.

Initial Data Set: { 72, 420, 230, 140, 350, 60, 12, 721, 311, 7 }

2. displayList(int[] list)

A utility method that prints the contents of the integer array to the console using Arrays.toString().

3. selectionSort(int[] list, int listLength)

Implements the Selection Sort algorithm. This method repeatedly finds the smallest element from the unsorted portion of the list and swaps it with the element at the beginning of the unsorted portion. 

Time Complexity: $O(n^2)$

4. binarySearch(int[] list, int listLength, int searchItem)

Implements the Binary Search algorithm. This is a highly efficient search method that requires the list to be sorted beforehand. It works by repeatedly dividing the search interval in half.

Time Complexity: $O(\log n)$

Return Value: Returns the index of the searchItem if found, or $-1$ otherwise.

🛠️ How to Run

Save: Save the code as Main.java.

Compile: Use the Java compiler (javac) in your terminal:

javac Main.java


Run: Execute the compiled class file:

java Main


📋 Example Console Output

Printing List: [72, 420, 230, 140, 350, 60, 12, 721, 311, 7]
Printing List: [7, 12, 60, 72, 140, 230, 311, 350, 420, 721]
Enter an integer to search for in the list ( 0 to 1000)
140
140 found ! 

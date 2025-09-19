#Custom Data Structures in Java

This repository contains custom implementations of ArrayList and Stack in Java using arrays.
Both are implemented from scratch without using Java’s built-in collection classes, for better understanding of core data structure mechanics.

##Implementations
###1. CustomArrayList

A dynamic array implementation that resizes itself when capacity is exceeded.

###Features:

add(int x) → Adds an element at the end, resizes if needed.

remove(int x) → Removes the first occurrence of a given element and shifts elements left.

contains(int v) → Checks if the element exists in the list.

get(int index) → Retrieves element at a specific index (returns -1 if index is invalid).

size() → Returns the number of elements.

###Example usage:

CustomArrayList list = new CustomArrayList(5);
list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1));     // 20
System.out.println(list.contains(30)); // true

list.remove(20);
System.out.println(list.size());     // 2

###2. CustomStack

A stack (LIFO) implementation backed by an integer array.

###Features:

push(int x) → Push an element onto the stack.

pop() → Removes the top element (throws exception if stack is empty).

peek() → Returns the top element without removing it.

search(int v) → Checks if a given element is present in the stack.

size() → Returns the number of elements currently in the stack.

###Example usage:

CustomStack stack = new CustomStack(5);
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek());  // 30
stack.pop();
System.out.println(stack.size());  // 2
System.out.println(stack.search(10)); // true

#How to Run

Clone the repository:

git clone <your-repo-link>


Open in an IDE (IntelliJ, Eclipse, VS Code) or compile via terminal:

javac CustomArrayList.java CustomStack.java
java CustomArrayList   // or java CustomStack if main method is added

#Time Complexities
Operation	CustomArrayList,CustomStack
Add (append)	O(1) amortized	–
Remove (by value)	O(n)	–
Get (by index)	O(1) - o(n)
Contains - O(n)
Push	–	O(1)
Pop	–	O(1)
Peek	–	O(1)
Size	O(1)
#Purpose

Learn how dynamic arrays and stacks work under the hood.

Practice exception handling for underflow/overflow conditions.

Build fundamentals of data structures without using Java Collections.

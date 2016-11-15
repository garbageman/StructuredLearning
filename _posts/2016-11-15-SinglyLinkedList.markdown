---
layout: default
title:  "Singly Linked Lists"
date:   2016-11-14 00:00:00
categories: main
---

## Singly Linked Lists

### Discussion
Lists are linear data structures that can come in multiple forms. Lists by themselves can be used to store data, but they are also very useful as the underlying data structure of other data structures with unique properties.
The version covered in this lesson is a Singly Linked List. There are some unique properties of singly linked lists. First, how are they structured? A singly linked list is made up of nodes. A node is an object that contains some value, or element, and also has a pointer to the next node in the list. This pointer is the link between nodes, and since there is only one, this list is singly linked.
Lists behave similarly to arrays, so what are some differences between the two and when are they useful? Arrays have constant access time to members of the array, because of indexing. A list has linear, or O(N) access time to its members because for any member, the list has to be traversed. Arrays are of fixed size however, so if there ever needs to be more elements added to the array than it contains, additional space must be allocated in a larger array. Linked lists are dynamically sized and will never need to reallocate large chunks of memory.
When are linked lists advantageous over arrays? When you are only interested in interacting with the first element in the list. Or if you are adding/removing/interacting with the start or end of the list much more than you are accessing the elements in the middle. We will see applications of this later on.

### Project

In the project, you are asked to implement your own Singly Linked list. A good way to approach this class is by creating a private Node class within the SinglyLinkedList class. Since this Node class will only be used by the SinglyLinkedList, it's good practice to keep it encapsulated within the SinglyLinkedList class. Once you have this Node class, then you only need a reference to the head of the list to represent the entire list.
Apart from creating the Node class, you must implement each method of the SinglyLinkedList class. The documentation is outlined in the comments of the methods.
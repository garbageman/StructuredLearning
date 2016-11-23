---
layout: default
title:  "Singly Linked Lists"
date:   2016-11-14 00:00:00
categories: main
---

## Singly Linked Lists

## Discussion
Lists are linear data structures that can come in multiple forms. Lists by themselves can be used to store data, but they are also very useful as the underlying data structure of other data structures with unique properties.
The version covered in this lesson is a Singly Linked List. There are some unique properties of singly linked lists. First, how are they structured? A singly linked list is made up of nodes. A node is an object that contains some value, or element, and also has a pointer to the next node in the list. This pointer is the link between nodes, and since there is only one, this list is singly linked.
Lists behave similarly to arrays, so what are some differences between the two and when are they useful? Arrays have constant access time to members of the array, because of indexing. A list has linear, or O(N) access time to its members because for any member, the list has to be traversed. Arrays are of fixed size however, so if there ever needs to be more elements added to the array than it contains, additional space must be allocated in a larger array. Linked lists are dynamically sized and will never need to reallocate large chunks of memory.
When are linked lists advantageous over arrays? When you are only interested in interacting with the first element in the list. Or if you are adding/removing/interacting with the start or end of the list much more than you are accessing the elements in the middle. We will see applications of this later on.

## Project
In the project, you are asked to implement your own Singly Linked list. A good way to approach this class is by creating a private Node class within the SinglyLinkedList class. Since this Node class will only be used by the SinglyLinkedList, it's good practice to keep it encapsulated within the SinglyLinkedList class. Once you have this Node class, then you only need a reference to the head of the list to represent the entire list.
Apart from creating the Node class, you must implement each method of the SinglyLinkedList class. The documentation is outlined in the comments of the methods.

<<<<<<< HEAD
## Project Spec
### Underlying data structure of a linked list
So what is a linked list comprised of? Most, if not all, data structures are simply compositions of other more simple data structures. A SinglyLinkedList is no exception. So what is a good way to implement a SinglyLinkedList? Lists generally are made up of nodes. A node is a structure that has two properties, the value that it holds, and a reference to the next node in the list. This way, we can represent a list merely as a reference to the head of the list, because each node has a reference to the next node in the list. Since we do not plan on using this node structure outside of this class, it is a good practice to create a private node class within SinglyLinkedList to use as the underlying data structure.

What exactly does this node class look like? Well it's entirely up to you but at the minimum a node class should have a instance variable that is the element it's storing and an instance variable that is a link to the next node in the list. A good start would be to create a Node class in your SinglyLinkedList class that you can use and create an instance variable, head, of the Node class that you can use as a reference to the head of the list.

### add(E element)
This method will add the parameter element to the front of the list. This means that there should be a new head of the list when the method is finished, and it should be the element that was just added to the list.

### remove(E element)
This method will remove the element if it can be found inside of the singly linked list.
=======
### Class Location
>>>>>>> parent of e9ac400... Fixed up blog posts (hopefully)

## Class Location
The class can be found in the org.structuredlearning.datastructures.linear package

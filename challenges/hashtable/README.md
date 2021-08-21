# Hashtables
a hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values

## Challenge
Implementing Hash table using two classes.

## Approach & Efficiency
Implemented a HashNode Class that will hold the data and the reference to the next node.
Implemented the HashTable class that will map the values into an arrayList of nodes.

## API
- Class HashNode :
  - Key and value of generic Types.
- Class HashTable :
  - add(K key , V value) : Adds a value to the hash table with the given key, value pair.
  - get(K key) : Retrieves the value of the given key, and null for non-existence.
  - contains(K key) : Checks if value is existing in the hash table.
  - hashCode() : Returns the hashCode of the table.



# Challenge 31
To find the first repeated word in a String and return it.

## Whiteboard Process
![solution](solution.png)

## Approach & Efficiency
Divided The String into an array of Strings and added each element into the hash table and return the first duplicate word.

## Solution
Simply Create a string and pass it to the method and print the result back.
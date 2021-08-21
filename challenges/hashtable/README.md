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
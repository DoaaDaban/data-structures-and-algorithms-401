# Trees
Tree is a non-linear data structure that uses connected nodes to represen hierarch data
and have a root node that have 0 or more children up to 2 children and that applies to every child node.

## Challenge
Challenge to implement Binary tree and Binary Search tree.

## Approach & Efficiency
Used recursion to traverse through the tree with time complexity of n,
Used Iterative approach to add to binary search tree with O(n),
Used Iterative to check if element exists with O(n).

## API
#### Class Node
Class Holds data and right and left children of elements.
#### Class BinaryTree
- Method DFSInOrder (Takes the root) : Recursion O(n) traverses using the InOrder method.
- Method DFSPreOrder (Takes the root) : Recursion O(n) traverses using the PreOrder method.
- Method DFSPostOrder (Takes the root) : Recursion O(n) traverses using the PostOrder method.


#### Class BinarySearchTree
- Method add(G data) : Iterativly adds an element to the right position O(n).
- Method contains(G key) : Iterativly searches an element exists to the right position O(n).
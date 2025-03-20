# Q1. md

##Ignore Constants
 In Big O, constant factors are ignored because they don't significantly affect growth for large n.
 If an algorithm runs in O(2n) time, we simplify it to O(n).
 If an algorithm has O(n + 5) complexity, we simplify it to O(n) because the +5 doesn’t matter for large n.



##Focus on the Dominant Term
 When multiple terms are added, keep only the term that grows the fastest as n increases.
 An algorithm with complexity O(n² + n) is simplified to O(n²) because n² dominates n for large inputs.Iterative Loops


##Iterative loops
A single loop running n times is O(n).
Nested loops multiply their complexities.
This is O(n × n) = O(n²).


##Consecutive Operations Add
 When different operations run one after another, you add their complexities and simplify.
 An algorithm that does O(n) work, followed by O(n²) work, has a total complexity of O(n + n²).
 We simplify it to O(n²) since it dominates.


##Recursive Calls Multiply 
 Recursive algorithms often follow patterns like dividing the input in half, leading to logarithmic complexity.
 A Binary Search divides the problem by 2 each time → O(log n) complexity.




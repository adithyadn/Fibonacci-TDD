# Fibonacci-TDD

The Fibonacci series of numbers start with 1, 1, 2, 3, 5, 8, 13, 21, ...
where values at position 0 and 1 are 1, and values at each position after
that are a sum of previous two positions.

Using test driven development, write three implementations of a function
to compute the Fibonacci number at a given position.

Start with one implementation at a time rather than rushing through all
of them at the same time.

#### The three implementations are described below:

1. A simple iteration. 
  Given a position n, loop through totaling values until you reach the value for the given position.

2. A simple recursion.
  Given a position, compute the value at a position using the expression fib(n-1) + fib(n-2).

3. A memoized recursion.
  Given a position, look up to see if the value has been precomputed and if so return that value. Otherwise, use recursion to compute the value.



#### What design principles did you use in the program?

We use several design principles in this assignment. 

Single Responsibility Principle (SRP):
We follow this principle everywhere in this assignment. Each class/function in the project has single responsibility to deal with. 

Don't Repeat Yourself (DRY):
We had this principle being violated two times due to which the overall design evolved better. One was when we had to reproduce the same set of test cases for iterative, recursive and memoized classes and the other was when we had to remove the effort of re-calculating the precomputed value in the FibonacciMemoized class. In both the cases inheritance came to our rescue. 

Dependency Inversion Principle (DIP):
We used this principle to make the test cases comply to DRY principle. In other words DIP was used to make it possible for the test class to switch the reference to different classes at runtime when each test class was to be run.

Open Closed Principle (OCP):
Open-closed principle asks us to keep the design open to extensibility and closed to modification. This was used by us when extending the recursive feature to add the memoized functionality. We did not change the FibonacciRecursive. The FibonacciMemoized class was created just by extending the features of Recursive class.

Liskov's Substitution Principle (LSP):
LSP suggests us not to stress upon runtime type identification for implementing a functionality. This was take care throughout the assignment. We followed LSP and designed the project in such a way that we didn't have to check for the type of the object.


#### What design patterns did you use in the program?

The design pattern which we use in this assignment is the factory method pattern. The main reason for using this pattern is for being able to switch between the choice of classes for different types of implementations in generating Fibonacci numbers at a given position.

The need for applying the factory method pattern is that there are tests that are common to all the types of implementation, hence to keep the design DRY we had to move all the common test cases to a common class which all other test class extend to and use factory method(getFibonacci()) to switch between classes during runtime.

All test classes extend the abstract class(FibonacciAbstractTest) and override the factory method in order to return the instance of the desired class that needs to be executed.

# Uncommon Java Bug: Premature Return in Finally Block

This repository demonstrates a subtle bug in Java related to the use of a return statement within a finally block.  The bug causes the program to exit prematurely, skipping code that would normally execute after the try-catch-finally block.

## The Bug

The `UncommonBug.java` file contains a `main` method that includes a try-catch-finally block.  An `ArithmeticException` is deliberately triggered by division by zero.  The catch block handles the exception. The finally block, however, contains a `return` statement, preventing the print statement after the `try-catch-finally` from executing.  This is unexpected behavior, as code after a finally block usually executes regardless of exceptions.

## The Solution

The `UncommonBugSolution.java` file shows how to fix the bug.  The solution involves moving the `return` statement outside the `finally` block, ensuring proper code execution. 

## Running the Code

1. Clone the repository.
2. Compile and run the Java files:  `javac *.java && java UncommonBug` and `javac *.java && java UncommonBugSolution`.
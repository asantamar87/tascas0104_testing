# Java Testing Project

## Introduction
This project demonstrates various Java testing techniques using **JUnit 5**, **AssertJ**, and **Test-Driven Development (TDD)**. It is divided into three levels:

- **Level 1:** JUnit Tests for basic functionality.
- **Level 2:** AssertJ assertions for more expressive testing.
- **Level 3:** TDD for building a `Calculator` class.

---

## Level 1: JUnit

### Exercise 1: Library Book Collection
Create a `Library` class to manage a collection of books.

**Functionalities:**
- Add books to the collection.
- Retrieve the full list of books.
- Get a book title by its position.
- Insert a book at a specific position.
- Remove a book by its title.

**JUnit Tests:**
- Verify that the book list is not null after instantiation.
- Confirm the list has the expected size after inserting books.
- Ensure the list contains a specific book at the correct position.
- Check there are no duplicate book titles.
- Verify retrieving a book title by position.
- Ensure adding a book updates the list correctly.
- Confirm removing a book decreases the list size.
- Verify the list remains alphabetically ordered after modifications.

---

### Exercise 2: DNI Letter Calculator
Create a `CalculoDni` class to calculate the correct letter for a Spanish DNI number.

**JUnit Tests:**
- Parameterize the test to cover a broad spectrum of 10 predefined DNI numbers.
- Verify that the calculated letter matches the expected result for each number.

---

### Exercise 3: Exception Handling
Create a class with a method that intentionally throws an `ArrayIndexOutOfBoundsException`.

**JUnit Tests:**
- Verify that the exception is thrown under the correct conditions.

---

## Level 2: AssertJ

### Exercise 1: Integer Equality
- Create assertions to demonstrate that two integer objects are equal and another to show they are not.

### Exercise 2: Object Reference
- Create assertions to demonstrate that two object references are the same and another to show they are different.

### Exercise 3: Array Equality
- Create an assertion to verify that two integer arrays are identical.

### Exercise 4: ArrayList Content and Order
- Create an `ArrayList` containing different types of objects.

**Assertions:**
- Verify the order of objects as they were inserted.
- Verify that the list contains the objects in any order.
- Verify that an object is only added once.
- Verify that a missing object is not in the list.

### Exercise 5: Map Key Verification
- Create a `Map` and verify that it contains a specific key.

### Exercise 6: Exception Assertion
- Trigger an `ArrayIndexOutOfBoundsException` and assert that it is thrown when expected.

### Exercise 7: Optional Assertion
- Create an empty `Optional` and assert that it is indeed empty.

---

## Level 3: Test-Driven Development (TDD)

### Exercise 1: Calculator
Create a `Calculator` class with methods for basic arithmetic operations: addition, subtraction, multiplication, and division.

**TDD Process:**
1. Create a test class `CalculatorTest`.
2. Write tests for `add`, `subtract`, `multiply`, and `divide` methods.
3. Run the tests — they should fail initially.
4. Implement the `Calculator` class with the specified methods.
5. Re-run the tests — they should pass.
6. Iterate through the TDD cycle, refactoring and expanding functionality as needed.

---

## How to Run the Tests
1. Clone the repository.
2. Ensure you have **JUnit 5** and **AssertJ** dependencies in your project.
3. Use your preferred IDE or run tests via terminal using:

```

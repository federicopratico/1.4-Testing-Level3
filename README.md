# 🧪 Java Testing: JUnit, AssertJ & TDD

## 📄 Description
This repository contains a comprehensive set of practical Java exercises designed to master **Unit Testing** and **Test Driven Development (TDD)**. The goal is to progress from basic JUnit test cases to fluent assertions using **AssertJ**, and finally, to implement logic using the **Red-Green-Refactor** TDD cycle.

## 📚 Exercise Details

### Level 1: JUnit Framework
**Exercise 1: Library Management System**
The objective is to create a class that manages a collection of books and verify its behavior using JUnit 5.

* **Class:** `Library` (manages a list of strings or Book objects).
* **Functionality:**
    * Add books to the collection.
    * Retrieve the full list of books.
    * Get a book title by specific position (index).
    * Add a book at a specific position.
    * Remove a book by title.
* **Test Cases (JUnit):**
    * Verify the list is **not null** after instantiation.
    * Confirm the list has the **expected size** after adding books.
    * Ensure the list contains a **specific book** at the correct position.
    * Verify there are **no duplicate** titles in the list.
    * Check that a book title can be retrieved by index.
    * Ensure adding a book correctly modifies the list.
    * Confirm removing a book decreases the list size.
    * Verify the list remains **alphabetically ordered** after insertions or deletions.

**Exercise 2: DNI Calculator (Parameterized Tests)**
* **Class:** `DniCalculator`
* **Logic:** Implement an algorithm that calculates the DNI letter based on the provided number.
* **Test Cases:** Create a **Parameterized Test** that receives a broad spectrum of data. It must validate that the calculation is correct for **10 pre-defined DNI numbers**.

**Exercise 3: Exception Testing**
* **Logic:** Create a class with a method that deliberately throws an `ArrayIndexOutOfBoundsException`.
* **Test Cases:** Verify using JUnit that the exception is thrown when expected.

### Level 2: Fluent Assertions with AssertJ
This level focuses on using the **AssertJ** library to write readable and expressive assertions.

**Exercise 1: Primitives**
* Assert that two Integer objects are equal.
* Assert that two Integer objects are *not* equal.

**Exercise 2: Object References**
* Assert that a reference to an object is the **same** as another.
* Assert that a reference to an object is **different** from another.

**Exercise 3: Arrays**
* Assert that two integer arrays are identical.

**Exercise 4: Collections (ArrayList)**
Create an `ArrayList` containing various object types.
* **Order:** Verify the order of objects matches the insertion order.
* **Any Order:** Verify the list contains specific objects in any order.
* **Frequency:** Verify an object was added only once.
* **Absence:** Leave a specific element out of the list and verify the list **does not** contain it.

**Exercise 5: Maps**
* Create a Map and verify it contains a specific **key**.

**Exercise 6: Exceptions in AssertJ**
* Trigger an `ArrayIndexOutOfBoundsException`.
* Write an assertion to validate that the exception is thrown correctly.

**Exercise 7: Optionals**
* Create an empty `Optional` object.
* Write the correct assertion to verify it is indeed empty.

### Level 3: Test Driven Development (TDD)
**Exercise 1: The Calculator**
Implement a `Calculator` class using the **TDD cycle** (Write Test -> Fail -> Write Code -> Pass -> Refactor).

* **Process:**
    1.  Create the test class `CalculatorTest`.
    2.  Write tests for **Add**, **Subtract**, **Multiply**, and **Divide** operations.
    3.  **Run Tests:** They must fail (Red) because the class doesn't exist yet.
    4.  Create the `Calculator` class and implement the minimum code to pass the tests.
    5.  **Run Tests:** They should pass (Green).
    6.  **Refactor:** Clean up code if necessary and repeat the cycle to improve functionality.

## 💻 Technologies Used
* **Java 21** - Core language.
* **JUnit 5** - Testing framework.
* **AssertJ** - Fluent assertion library.
* **IDE** (IntelliJ IDEA / Eclipse) - Development environment.
* **Git** - Version control.

## 📋 Requirements
* **Java SDK 17** or higher installed locally.
* **Maven/Gradle** (recommended for managing AssertJ dependencies).
* Basic understanding of:
    * Java Classes and Objects.
    * `try-catch` blocks and Exceptions.
    * Collection Framework (`ArrayList`, `HashMap`).

## 🛠️ Installation
1.  Clone this repository:
    ```bash
    git clone https://github.com/federicopratico/1.4-Testing-Level3.git
    ```
    or with SSH:
    ```bash
    git clone git@github.com:federicopratico/1.4-Testing-Level3.git
    ```

2.  Navigate to the project directory:
    ```bash
    cd 1.4-Testing-Level3
    ```
3.  Open the project in your preferred IDE.

## 🚀 Execute
Since this project focuses on testing, execution is done via the **Test Runner**.

1.  **Level 1 & 2:**
    * Navigate to the test folder (e.g., `src/test/java`).
    * Right-click on the test class (e.g., `TestLibrary`) and select **"Run 'TestLibrary' "** (or generic "Run Tests").
    * Observe the console for Green (Pass) or Red (Fail) indicators.
2.  **Level 3 (TDD):**
    * Open `CalculatorTest`.
    * Run the tests frequently as you implement the logic in the `Calculator` class to experience the TDD workflow.

## 🤝 Contributions
Contributions are welcome! If you want to add more edge cases or new TDD katas:

1.  **Fork** the repository.
2.  Create a **branch** for your feature:
    ```bash
    git checkout -b feature/NewTDDExercise
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Added Fibonacci sequence TDD"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/NewTDDExercise
    ```
5.  Open a **Pull Request**.

# Java Examples

A collection of small Java programs demonstrating core concepts.

## Contents

- **Array** – demonstrates arrays with a simple `Student` class.
- **Calculator** – basic arithmetic operations using a helper class.
- **Encapsulation** – illustrates encapsulation through getters and setters.
- **StaticDemo** – shows static variables, methods, and blocks.
- **Strings** – experiments with common `String` operations.

## Running the examples

From the repository root:

```bash
# Compile all examples
mkdir -p out
find . -name "*.java" -print0 | xargs -0 javac -d out

# Run an example (replace Array.Demo with the class you want to run)
java -cp out Array.Demo
```

Each folder contains one or more classes with a `main` method that can be executed in this way.

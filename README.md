# Java Examples

A collection of small Java programs demonstrating core concepts.

## Contents

Source is organized under `src/main/java/com/example`:

- **array** – demonstrates arrays with a simple `Student` class.
- **calculator** – basic arithmetic operations using a helper class.
- **encapsulation** – illustrates encapsulation through getters and setters.
- **staticdemo** – shows static variables, methods, and blocks.
- **strings** – experiments with common `String` operations.

## Running the examples

From the repository root:

```bash
# Compile all examples
mkdir -p out
find src/main/java -name "*.java" -print0 | xargs -0 javac -d out

# Run an example (replace com.example.array.Demo with the class you want to run)
java -cp out com.example.array.Demo
```

Each package contains one or more classes with a `main` method that can be executed in this way.

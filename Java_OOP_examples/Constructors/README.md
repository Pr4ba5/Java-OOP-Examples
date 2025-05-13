# 🏗️ Java Constructors

## 🔷 THE CONCEPT

In Java, a **constructor** is a special method that is called when an object is created. Its main purpose is to **initialize objects**.

A constructor has:
- The **same name** as the class.
- **No return type**, not even `void`.
- Can be **default (no parameters)** or **parameterized**.

---

### 🧠 REAL-LIFE ANALOGY

Think of a **new phone**:
- When you buy it, it already comes with some default settings — that’s like a **default constructor**.
- But when you personalize it with your name, language, and theme — that’s like using a **parameterized constructor** to initialize it with specific values.

---

## ❓ WHEN AND WHY TO USE CONSTRUCTORS

Use constructors to:
- Automatically assign initial values to variables when an object is created.
- Avoid writing repetitive code to initialize object properties.
- Set up an object in a valid state from the beginning.

---

## 🔎 TYPES OF CONSTRUCTORS

| Type               | Description                                      |
|--------------------|--------------------------------------------------|
| Default Constructor | No parameters, assigns default values            |
| Parameterized Constructor | Takes parameters to set custom initial values |

---

## 💡 EXAMPLE CODE

  You can simply find the code with proper documentation in java file.


## ⚠️ COMMON PITFALLS

- Forgetting that constructors **don’t have a return type**.
- Overloading constructors without understanding how **constructor chaining** works.
- Not initializing all required variables in parameterized constructors.

---

📂 **You can find the example code with both default and parameterized constructors in the `Student.java` and `Main.java` files in this folder.**

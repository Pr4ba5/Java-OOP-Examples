# 🧬 Java Inheritance

## 🔷 THE CONCEPT

Inheritance is one of the core concepts of Object-Oriented Programming in Java.so basically, it allows one class to **inherit** the properties/attributes (fields) and behaviors (methods) of another class.

- The class that **inherits** is called the **subclass** (or child class).
- The class being inherited from is called the **superclass** (or parent class).

This promotes **code reusability**, **modularity**, and **hierarchical relationships** between classes.

---

### 🧠 REAL-LIFE ANALOGY

Imagine a class `Vehicle` that has properties like `speed` and methods like `move()`.

Now, a class `Car` can inherit from `Vehicle`, meaning it automatically **gets the basic behavior** of a vehicle but can also have additional features like `musicSystem`, `airConditioning()`, etc.

Just like how a **Tesla** is a specific type of vehicle with more advanced features.

---

## ❓ WHEN AND WHY TO USE INHERITANCE

Use inheritance when:
- You want to **reuse** code across similar classes.
- You want to **extend** or specialize existing classes without rewriting them.
- You’re modeling **"is-a"** relationships (e.g., Car is a Vehicle, Dog is an Animal).

---

## 🧩 SYNTAX

```java
class SuperClass {
    // fields and methods
}

class SubClass extends SuperClass {
    // inherits fields and methods from SuperClass
    // can also have its own fields and methods
}
```

---

## 💡 EXAMPLE CODE

likewise, you can find the code with proper documentation on java file, make sure you visit there. hehehe
---

## ⚠️ COMMON PITFALLS / INTERVIEW QUESTIONS

- ❓ Can a subclass inherit private members?  
  ➤ No, private members are not accessible directly but can be accessed through public/protected methods.

- ❓ What is method overriding?  
  ➤ When a subclass provides a specific implementation of a method already defined in the parent class.

- ❓ Can Java support multiple inheritance?  
  ➤ Not with classes. Java supports it through **interfaces** to avoid ambiguity.

---

📂 You can find the full example in `InheritanceExample.java` in this folder.

